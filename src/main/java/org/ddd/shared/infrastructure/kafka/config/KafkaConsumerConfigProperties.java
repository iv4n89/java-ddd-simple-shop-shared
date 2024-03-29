package org.ddd.shared.infrastructure.kafka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "kafka-consumer-config")
public class KafkaConsumerConfigProperties {
    private String keyDeserializationClass; // Default StringDeserializer
    private String valueDeserializationClass; // Default JsonDeserializer
    private Integer sessionTimeoutMs;
    private Integer heartbeatIntervalMs;
    private String groupId;
}
