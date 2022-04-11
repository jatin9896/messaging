package com.virginvoyages.seaware.seaware;

import com.virginvoyages.seaware.xml.ota.data.*;
import feign.Response;
import feign.Util;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import org.springframework.http.HttpStatus;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.lang.reflect.Type;

/**
 * JAXB Decoder for Seaware response objects.
 * 
 */
public class SeawareJaxbDecoder implements Decoder {

    private static JAXBContext instance;

    @Override
    public Object decode(Response response, Type type) throws IOException {
        if (response.status() == HttpStatus.NOT_FOUND.value()) {
            return Util.emptyValueOf(type);
        }
        if (response.body() == null) {
            return null;
        }
        if (!(type instanceof Class)) {
            throw new UnsupportedOperationException("JAXB only supports decoding raw types. Found " + type);
        }
        try {
            final JAXBContext jaxbContext = getJaxbContextInstance();
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return jaxbUnmarshaller.unmarshal(new InputSource(response.body().asInputStream()));
        } catch (JAXBException e) {
            throw new DecodeException(e.toString(), e);
        } finally {
            if (response.body() != null) {
                response.body().close();
            }
        }
    }

    /**
     * Initialize  JaxbContext.
     * 
     * @return JAXBContext
     */
    public static JAXBContext getJaxbContextInstance() throws DecodeException {
        try {
            if (instance == null) {
                instance = JAXBContext.newInstance(OTACruiseBookingHistoryRS.class,
                        OTACruisePNRUpdateNotifRQ.class, OTACruiseBookRQ.class,
                        OTACruiseBookRS.class);
            }
        } catch (Exception e) {
            throw new DecodeException(e.toString(), e);
        }
        return instance;
    }
}
