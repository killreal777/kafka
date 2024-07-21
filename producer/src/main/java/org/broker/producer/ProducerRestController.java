package org.broker.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequiredArgsConstructor
public class ProducerRestController {

    private final KafkaProducer kafkaProducer;

    @GetMapping("/")
    public String home() {
        return "Producer " + LocalTime.now() + "\n";
    }

    @GetMapping("/{message}")
    public MessageDto send(@PathVariable String message) {
        MessageDto messageDto = new MessageDto(message);
        kafkaProducer.sendMessage(messageDto);
        return messageDto;
    }

}
