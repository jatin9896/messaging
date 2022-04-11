package com.virginvoyages.seaware.service;

import com.virginvoyages.seaware.mapper.SeawareMapper;
import com.virginvoyages.seaware.seaware.SeawareJaxbDecoder;
import com.virginvoyages.seaware.xml.ota.data.OTACruisePNRUpdateNotifRQ;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.time.Duration;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
@Slf4j
public class WordCountProcessor {

    private static final Serde<String> STRING_SERDE = Serdes.String();

    @Autowired
    void buildPipeline(StreamsBuilder streamsBuilder) {

        AtomicBoolean isDuplicate = new AtomicBoolean(false);
        KStream<String, String> messageStream = streamsBuilder
                .stream("input-topic-md", Consumed.with(STRING_SERDE, STRING_SERDE));

        HashMap< UUID, OTACruisePNRUpdateNotifRQ>  map = new HashMap<>() ;


        // printing
        messageStream.foreach((key,value) -> {
            log.info("Key = {} \n value = {} \n" ,key , value);
            StringReader reader = null;
            try{
                reader = new StringReader(value) ;
                Unmarshaller unmarshaller = SeawareJaxbDecoder.getJaxbContextInstance().createUnmarshaller();
                OTACruisePNRUpdateNotifRQ otaCruisePNRUpdateNotifRQ = (OTACruisePNRUpdateNotifRQ) unmarshaller
                        .unmarshal(reader);
                log.info("Object is : " + otaCruisePNRUpdateNotifRQ);
                if(map.containsValue(otaCruisePNRUpdateNotifRQ)){
                    // discard
                    isDuplicate.set(true);
                }else {
                    map.put(UUID.randomUUID(), otaCruisePNRUpdateNotifRQ);
                    isDuplicate.set(false);
                }
            }catch (Exception e){
                log.info("Error !");
            }
        });

        KTable<Windowed<String>, Long> count = messageStream.groupByKey()
                .windowedBy(SlidingWindows.withTimeDifferenceAndGrace(Duration.ofSeconds(5), Duration.ofSeconds(5)))
                .count();

        count.toStream().foreach((k,v)-> {
            log.info("Stop for 5 seconds count " + isDuplicate.get());
            log.info("Key = {} \n value = {} \n", k, v);
        });


        // Windowed Aggregration
//        messageStream.groupByKey()
//                .windowedBy(SlidingWindows.withTimeDifferenceAndGrace(Duration.ofSeconds(1), Duration.ofSeconds(1)))
//                .aggregate(
//
//                )


//        KTable<String, Long> wordCounts = messageStream
//                .mapValues((ValueMapper<String, OTACruisePNRUpdateNotifRQ>) SeawareMapper::apply)
//                .groupByKey()
//                .windowedBy(SlidingWindows.withTimeDifferenceAndGrace(Duration.ofSeconds(1), Duration.ofSeconds(1)))




//        wordCounts.toStream().foreach((k,v)-> {
//            log.info("Before Posting to Output Topic");
//            log.info("Key = {} \n value = {} \n", k, v) ;
//        });

        if(isDuplicate.compareAndSet(false,true)) {
            System.out.println("Final Publish Happening ");
            messageStream.to("output-topic-md");
        }
    }

}
