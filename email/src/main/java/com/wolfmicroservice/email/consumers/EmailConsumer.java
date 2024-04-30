package com.wolfmicroservice.email.consumers;

import com.wolfmicroservice.email.dtos.EmailRecordDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    // Anotação para definir como ouvindo e definindo qual fila que será ouvida por este método
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRecordDto emailRecordDto){
        System.out.printf(emailRecordDto.emailTo());
    }
}
