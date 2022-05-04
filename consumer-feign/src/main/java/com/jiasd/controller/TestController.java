package com.jiasd.controller;

import com.jiasd.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 测试
 */
@RestController
public class TestController {

    /**
     * 使用服务名才能负载均衡，不能使用直接使用地址
     */
    private static final String REST_URL_PREFIX = "http://provider";

    @Autowired
    private TestDao cientService;

    @GetMapping("/testGet")
    public String testGet() {
        String s = cientService.testGet("dddddd");
        return s;
    }
    @GetMapping("/testGets")
    public String testGets() {
        String s = cientService.testGet("uuuuuu");
        return s;
    }
    /*@GetMapping("/testPost")
    public String testPost() {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<String, Object>();
        params.add("name", getName());
        HttpEntity< MultiValueMap<String, Object>> request = new HttpEntity<>(params, null);
        ResponseEntity<String> res = restTemplate.postForEntity(REST_URL_PREFIX + "/sayHello", request, String.class);
        return res.getBody();
    }*/

    private String getName() {
        List<String> greetings = Arrays.asList("Bob", "Alice", "Jack");
        Random rand = new Random();
        int randomNum = rand.nextInt(greetings.size());
        return greetings.get(randomNum);
    }
}
