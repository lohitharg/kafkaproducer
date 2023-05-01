package com.example.kafkaservice.PC;


import com.example.kafkaservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    // Autowiring Kafka Template
    @Autowired
    KafkaTemplate<String, Employee> kafkaTemplate;


    public void sendMessage(String message) {
        Employee em= Employee.builder()
                .id(1)
                .name("lohi")
                .build();

        kafkaTemplate.send("firsttopic",em);
    }
}
