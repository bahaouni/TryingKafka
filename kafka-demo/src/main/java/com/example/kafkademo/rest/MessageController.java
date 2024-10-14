package com.example.kafkademo.rest;

import com.example.kafkademo.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/messages")
public class MessageController {
    private final KafkaProducer kafkaProducer ;
    @PostMapping()
    public ResponseEntity<String> sendMessge(
            @RequestBody String msg
    )
    {
        kafkaProducer.sendMessage(msg);
        return new ResponseEntity<String>("teb3ath", null, 200 );
    }
}
