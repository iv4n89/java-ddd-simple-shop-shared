package org.ddd.shared.infrastructure.kafka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "kafka-producer-config")
public class KafkaProducerConfigProperties {
    private String keySerializationClass;
    private String valueSerializationClass;
    private Integer requestTimeoutMs;
    private Integer retryCount;
}
