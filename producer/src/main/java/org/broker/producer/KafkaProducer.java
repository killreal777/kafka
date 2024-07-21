package org.broker.producer;

import lombok.RequiredArgsConstructor;
import org.broker.dto.MessageDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, MessageDto> kafkaTemplate;

    public void sendMessage(MessageDto message) {
        kafkaTemplate.send("try", message);
    }

}
