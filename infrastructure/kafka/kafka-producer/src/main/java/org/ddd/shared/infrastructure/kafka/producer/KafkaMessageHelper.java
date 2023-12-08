package org.ddd.shared.infrastructure.kafka.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.function.BiConsumer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class KafkaMessageHelper {

    private final ObjectMapper objectMapper;

    public <T> BiConsumer<SendResult<String, T>, Throwable> getKafkaCallback(
            String responseTopicName,
            T avroModel,
            String id,
            String avroModelName
    ) {
        return (result, exception) -> {
            if (exception == null) {
                RecordMetadata metadata = result.getRecordMetadata();
                log.info(
                        "Received successful response from Kafka for {} id: {}, Topic: {} Partition: {} Offset: {} Timestamp: {}",
                        avroModelName,
                        id,
                        metadata.topic(),
                        metadata.partition(),
                        metadata.offset(),
                        metadata.timestamp()
                );
            } else {
                log.error(
                        "Error while sending {} with message: {} to topic {}",
                        avroModelName,
                        avroModel.toString(),
                        responseTopicName,
                        exception
                );
            }
        };
    }

}
