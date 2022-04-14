package com.virginvoyages.seaware.seaware;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KeyValueMapper;
import org.apache.kafka.streams.kstream.Transformer;
import org.apache.kafka.streams.kstream.ValueTransformerWithKey;
import org.apache.kafka.streams.kstream.Windowed;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.state.KeyValueIterator;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.WindowStore;
import org.apache.kafka.streams.state.WindowStoreIterator;

import java.time.Duration;

@Slf4j
public class Deduplicatetransformer<K,V, E> implements Transformer<K, V, KeyValue<K, V>> {

    private static String storeName = "data-store";

    private final KeyValueMapper<K,V,E> data;

    private ProcessorContext context;

    private WindowStore<E, Long> eventIdStore;

    public Deduplicatetransformer(final KeyValueMapper<K,V,E> data) {
      this.data = data;
    }

    @Override
    public void init(ProcessorContext processorContext) {
        this.context = processorContext;
        eventIdStore = (WindowStore<E, Long>) context.getStateStore(storeName);
    }

    @Override
    public KeyValue<K, V> transform(K key, V value) {
        final E eventId = data.apply(key, value);
        if (eventId == null) {
            return KeyValue.pair(key, value);
        } else {
            final KeyValue<K, V> output;
            if (isDuplicate(eventId)) {
                output = null;
            } else {
                output = KeyValue.pair(key, value);
                eventIdStore.put(eventId, context.timestamp(), context.timestamp());
            }
            return output;
        }
    }

    private boolean isDuplicate(final E eventId) {
        final long eventTime = context.timestamp();
        KeyValueIterator<Windowed<E>, Long>   timeIterator = eventIdStore.fetchAll(
                (eventTime - Duration.ofSeconds(50).toMillis()), eventTime + Duration.ofSeconds(50).toMillis());
        final boolean isDuplicate = timeIterator.hasNext();
        System.out.println("---------  Event came  ---- with duplicate value: " + isDuplicate);
        timeIterator.close();
        return isDuplicate;
    }



    @Override
    public void close() {

    }
}