package com.example.kafkaservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Employee {
    String name;
    int id;

}
