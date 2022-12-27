package com.jiasd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String testGet() {
        return "dddd";
    }
    @GetMapping("/uuu")
    public String testuuu() {
        return "uuuuuuuuu";
    }
}
