package org.broker.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequiredArgsConstructor
public class ConsumerRestController {

    private final KafkaConsumer kafkaConsumer;

    @GetMapping("/")
    public String home() {
        return "Consumer " + LocalTime.now() + "\n";
    }

    @GetMapping("/all")
    public String all() {
        return kafkaConsumer.getMessages().toString();
    }

    @GetMapping("/length")
    public int length() {
        return kafkaConsumer.getMessages().size();
    }

    @GetMapping("/first")
    public MessageDto first() {
        return (length() > 0) ? kafkaConsumer.getMessages().get(0) : null;
    }

    @GetMapping("/last")
    public MessageDto last() {
        return (length() > 0) ? kafkaConsumer.getMessages().get(length() - 1) : null;
    }

}
