package com.jiasd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterCenter2Application {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCenter2Application.class, args);
    }

}
