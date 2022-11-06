package com.visu.springkafkaproducerconsumer.controller;

import com.visu.springkafkaproducerconsumer.producer.KafKaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class KafkaProducerController {

    private final KafKaProducerService kafKaProducerService;

    @Autowired
    public KafkaProducerController(KafKaProducerService kafKaProducerService) {
        this.kafKaProducerService = kafKaProducerService;
    }

    @PostMapping("/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.kafKaProducerService.sendMessage(message);
    }
}
