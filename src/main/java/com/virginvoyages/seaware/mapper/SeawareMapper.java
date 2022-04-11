package com.virginvoyages.seaware.mapper;

import com.virginvoyages.seaware.seaware.SeawareJaxbDecoder;
import com.virginvoyages.seaware.xml.ota.data.OTACruisePNRUpdateNotifRQ;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.ValueMapper;

import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@Slf4j
public class SeawareMapper {

    public static OTACruisePNRUpdateNotifRQ apply(String value) {
        log.info("value = {} \n", value);
        StringReader reader = null;
        try{
            reader = new StringReader(value) ;
            Unmarshaller unmarshaller = SeawareJaxbDecoder.getJaxbContextInstance().createUnmarshaller();
            OTACruisePNRUpdateNotifRQ otaCruisePNRUpdateNotifRQ = (OTACruisePNRUpdateNotifRQ) unmarshaller
                    .unmarshal(reader);
            log.info("Object is : " + otaCruisePNRUpdateNotifRQ);
            return otaCruisePNRUpdateNotifRQ ;
        }catch (Exception e){
            log.info("Error !");
            throw new RuntimeException();
        }
    }
}