package org.ddd.shared.infrastructure.kafka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "kafka-config")
public class KafkaConfig {
    private String bootstrapServers;
    private Integer numOfPartitions;
    private Short replicationFactor;
}
