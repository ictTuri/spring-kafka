package com.arturmolla.consumer;

import com.arturmolla.producer.model.MessageRequest;
import com.arturmolla.service.MessageService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class KafkaListeners {

    private final MessageService messageService;

    public KafkaListeners(MessageService messageService) {
        this.messageService = messageService;
    }

    @KafkaListener(topics = "artur", groupId = "groupId", containerFactory="factory")
    void listener(@Payload MessageRequest data){
            messageService.save(data);
    }
}
