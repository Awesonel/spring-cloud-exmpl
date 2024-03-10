package com.example.demo.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="data-producer")
public interface ProducerDataClient {

    @GetMapping("/data")
    String getDataFromProducer();

}


