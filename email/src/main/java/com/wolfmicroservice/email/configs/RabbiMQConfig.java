package com.wolfmicroservice.email.configs;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbiMQConfig {

    @Value("${broker.queue.email.name}")
    private String queue;

    @Bean
    public Queue queue() {
        // nova instancia do tipo Queue, passando a configuração e a definição que é uma fila duravel
        return new Queue(queue, true);

    }
}
