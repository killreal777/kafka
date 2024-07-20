package org.broker.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerRestController {

    private final KafkaProducer kafkaProducer;

    @GetMapping("/")
    public String home() {
        return "Producer\n";
    }

    @GetMapping("/{message}")
    public String send(@PathVariable String message) {
        kafkaProducer.sendMessage(message);
        return message;
    }

}
