package org.broker.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerRestController {

    @GetMapping("/")
    public String home() {
        return "Producer\n";
    }

}
