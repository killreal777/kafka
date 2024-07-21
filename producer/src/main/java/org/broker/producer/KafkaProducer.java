package org.broker.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {

    @Value("${application.kafka.topic}")
    private String topicName;

    private final KafkaTemplate<String, MessageDto> kafkaTemplate;

    public void sendMessage(MessageDto message) {
        kafkaTemplate.send(topicName, message);
    }

}
