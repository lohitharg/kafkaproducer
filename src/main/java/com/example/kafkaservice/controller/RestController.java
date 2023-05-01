package com.example.kafkaservice.controller;

import com.example.kafkaservice.PC.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/api")
public class RestController {

@Autowired
Producer producer;
    @GetMapping("/message")
    public void getMessage(@RequestParam("message") String message){
 producer.sendMessage(message);
    }
}
