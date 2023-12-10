package org.ddd.shared.infrastructure.kafka;

public interface KafkaConsumer<T> {
    void receive(T payload);
}
