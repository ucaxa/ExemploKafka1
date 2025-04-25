package com.service.leitor_service.service;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MensagemListener {

    @KafkaListener(topics = "mensagem-topico",groupId = "consumer1-group")
    public  void processarMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }

}
