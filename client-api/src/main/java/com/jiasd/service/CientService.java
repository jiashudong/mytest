package com.jiasd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "localhost:8081",fallbackFactory = ClientServiceFactory.class)
public interface CientService {
    @GetMapping("/sayHello")
    public String testGet(String name);
}
