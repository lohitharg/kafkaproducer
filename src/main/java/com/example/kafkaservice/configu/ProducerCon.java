package com.example.kafkaservice.configu;

import com.example.kafkaservice.model.Employee;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProducerCon {

        @Bean
        public ProducerFactory<String, Employee> producerFactory() {
            Map<String, Object> props = new HashMap<>();
            props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
            props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
            props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

            return new DefaultKafkaProducerFactory<>(props);
        }
    @Bean
    public KafkaTemplate<String, Employee> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

}
