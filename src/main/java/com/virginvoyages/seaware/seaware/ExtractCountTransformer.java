package com.virginvoyages.seaware.seaware;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.ValueTransformerWithKey;
import org.apache.kafka.streams.processor.api.ProcessorContext;
import org.apache.kafka.streams.state.KeyValueStore;

@Slf4j
public class ExtractCountTransformer implements ValueTransformerWithKey<String, String, String> {

    private KeyValueStore<String, String> yourKTableKvStore;
    private ProcessorContext context;

    @Override
    public void init(org.apache.kafka.streams.processor.ProcessorContext processorContext) {
        this.context = context;
        yourKTableKvStore = (KeyValueStore<String, String>) context.getStateStore("your_ktable_name");
    }

    @Override
    public String transform(String readOnlyKey, String value) {
        //extract count to prometheus
        System.out.println("partition {} - approx count {}" +  context.recordMetadata().get() + yourKTableKvStore.approximateNumEntries());
        yourKTableKvStore.approximateNumEntries();
        return value;
    }

    @Override
    public void close() {

    }
}