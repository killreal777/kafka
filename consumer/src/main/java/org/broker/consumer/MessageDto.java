package org.broker.consumer;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@NoArgsConstructor
public class MessageDto {
    private int id;
    private String message;

    public MessageDto(String message) {
        this.id = new Random().nextInt();
        this.message = message;
    }
}
