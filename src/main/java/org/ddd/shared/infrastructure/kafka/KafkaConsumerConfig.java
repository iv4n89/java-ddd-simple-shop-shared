package org.ddd.shared.infrastructure.kafka;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.ddd.shared.infrastructure.kafka.config.KafkaConfig;
import org.ddd.shared.infrastructure.kafka.config.KafkaConsumerConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Configuration
@RequiredArgsConstructor
@EnableKafka
public class KafkaConsumerConfig<T> {

    private final KafkaConfig kafkaConfig;
    private final KafkaConsumerConfigProperties kafkaConsumerConfigProperties;

    @Bean
    public Map<String, Object> consumerConfig() {
        return Map.of(
                ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaConfig.getBootstrapServers(),
                ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, kafkaConsumerConfigProperties.getKeyDeserializationClass(),
                ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, kafkaConsumerConfigProperties.getValueDeserializationClass(),
                ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, kafkaConsumerConfigProperties.getSessionTimeoutMs(),
                ConsumerConfig.HEARTBEAT_INTERVAL_MS_CONFIG, kafkaConsumerConfigProperties.getHeartbeatIntervalMs(),
                JsonDeserializer.TRUSTED_PACKAGES, "*"
        );
    }

    @Bean
    public ConsumerFactory<String, T> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfig());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, T> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, T> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }

}
