package org.broker.consumer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    @Getter
    private final ArrayList<MessageDto> messages;

    @KafkaListener(topics = "${application.kafka.topic}", groupId = "consumer")
    public void listen(MessageDto message) {
        messages.add(message);
        System.out.println("Received message: " + message);
    }

}
