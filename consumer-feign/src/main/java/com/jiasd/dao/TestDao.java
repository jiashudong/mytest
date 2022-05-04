
package com.jiasd.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="provider")
public interface TestDao {
    @GetMapping("/sayHello")
    public String testGet(@RequestParam String name);
}

