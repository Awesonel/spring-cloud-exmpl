package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SomeController {

    private ProducerDataClient producerDataClient;

    public SomeController(ProducerDataClient producerDataClient) {
        this.producerDataClient = producerDataClient;
    }

    @GetMapping("/consume-data")
    public String consumeData() {
        String dataFromConsumer = producerDataClient.getDataFromProducer();
        return String.format("Received data from producer: \"%s\"", dataFromConsumer);
    }
}
