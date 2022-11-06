package com.jiasd.restservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册的服务
 */
@RestController
public class RestService {
    /**
     * 日志
     */
    private static final Logger LOG = LoggerFactory.getLogger(RestService.class);

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        LOG.info("sayHello was called1");
        return "hello, " + name;
    }
}
