package org.ddd.shared.infrastructure.kafka;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.ddd.shared.infrastructure.kafka.config.KafkaConfig;
import org.ddd.shared.infrastructure.kafka.config.KafkaProducerConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
@RequiredArgsConstructor
public class KafkaProducerConfig<T> {

  private final KafkaConfig kafkaConfig;
  private final KafkaProducerConfigProperties kafkaProducerConfigProperties;

  @Bean
  public Map<String, Object> producerConfig() {
    return Map.of(
            ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaConfig.getBootstrapServers(),
            ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, kafkaProducerConfigProperties.getKeySerializationClass(),
            ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, kafkaProducerConfigProperties.getValueSerializationClass(),
            ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, kafkaProducerConfigProperties.getRequestTimeoutMs(),
            ProducerConfig.RETRIES_CONFIG, kafkaProducerConfigProperties.getRetryCount()
    );
  }

  @Bean
  public ProducerFactory<String, T> producerFactory() {
    return new DefaultKafkaProducerFactory<>(producerConfig());
  }

  @Bean
  public KafkaTemplate<String, T> kafkaTemplate() {
    return new KafkaTemplate<>(producerFactory());
  }
}
