package com.jiasd.service;

import org.springframework.stereotype.Component;

@Component
public class ClientServiceFactory implements CientService{
    public String testGet(String name) {
        return "hgdhdghdddhd";
    }
}
