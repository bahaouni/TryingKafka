package com.example.kafkademo.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String,String> kafkaTemplate;
    public void sendMessage(String msg){
        log.info(String.format("Sending message: %s", msg));
        kafkaTemplate.send("baha",msg);
    }

}
