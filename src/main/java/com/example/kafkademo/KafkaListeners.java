package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaListeners {

    @KafkaListener(topics = "david")
    void listeners(String data){
        if (data == null || data.isBlank()) {
            System.err.println("Received null or empty data from Kafka");
            return;
        }
        System.out.println("Listener received " + data);
    }

}
