package com.virginvoyages.seaware.service;

import com.virginvoyages.seaware.seaware.Deduplicatetransformer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.state.StoreBuilder;
import org.apache.kafka.streams.state.Stores;
import org.apache.kafka.streams.state.WindowStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
@Slf4j
public class WordCountProcessor {

    private static final Serde<String> STRING_SERDE = Serdes.String();
    private static String storeName = "data-store";

    @Autowired
    void buildPipeline(StreamsBuilder streamsBuilder) {

        AtomicBoolean isDuplicate = new AtomicBoolean(false);

//   String name, long retentionPeriod, long windowSize, boolean retainDuplicates, long segmentInterval, boolean timestampedStore) {
        final StoreBuilder<WindowStore<String, Long>> dedupStoreBuilder = Stores.windowStoreBuilder(
                Stores.persistentWindowStore(storeName,
                        Duration.ofMillis(50000),
                        Duration.ofMillis(50000),
                        false
                ),
                Serdes.String(),
                Serdes.Long());

        streamsBuilder.addStateStore(dedupStoreBuilder);

        KStream<String, String> messageStream = streamsBuilder
                .stream("input-topic-md", Consumed.with(STRING_SERDE, STRING_SERDE));
        KStream<String, String> transformResult =
                messageStream.transform(() -> new Deduplicatetransformer<>((key, value) -> value), storeName);

        transformResult.to("output-topic-md");

/*
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
                log.info("Error !" + e.getMessage());
                e.printStackTrace();
            }
        });
*/
/*

        System.out.println("========================   Stareted Kstream  ================================= ");

        KTable<Windowed<String>, Long> count = messageStream.groupByKey()
                .windowedBy(SlidingWindows.withTimeDifferenceAndGrace(Duration.ofSeconds(50), Duration.ofSeconds(5)))
                .count();

        System.out.println(" ----  Count of events  ----" + count);
        count.toStream().foreach((k,v)-> {
            log.info("Stop for 5 seconds count " + isDuplicate.get());
            log.info("Key = {} \n value = {} \n", k, v);
        });
*/

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
/*
        if(isDuplicate.compareAndSet(false,true)) {
            System.out.println("Final Publish Happening ");
            messageStream.to("output-topic-md");
        }*/
    }

}
