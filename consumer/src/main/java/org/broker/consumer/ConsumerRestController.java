package org.broker.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConsumerRestController {

    private final KafkaConsumer kafkaConsumer;

    @GetMapping("/")
    public String home() {
        return "Consumer\n";
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
    public String first() {
        return (length() > 0) ? kafkaConsumer.getMessages().get(0) : null;
    }

    @GetMapping("/last")
    public String last() {
        return (length() > 0) ? kafkaConsumer.getMessages().get(length() - 1) : null;
    }

}
