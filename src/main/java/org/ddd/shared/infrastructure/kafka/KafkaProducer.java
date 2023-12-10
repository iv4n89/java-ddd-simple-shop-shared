package org.ddd.shared.infrastructure.kafka;

public interface KafkaProducer<T> {
    void send(String topic, T payload);
}
