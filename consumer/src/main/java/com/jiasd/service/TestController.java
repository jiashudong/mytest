package com.jiasd.service;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private EurekaClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {
        return "hetyttye";
    }

    @GetMapping("/testGet")
    public String testGet() {
        System.out.println(REST_URL_PREFIX + "/sayHello");
        ResponseEntity<String> res = restTemplate.getForEntity(REST_URL_PREFIX + "/sayHello?name={1}", String.class, getName());
        return res.getBody();
    }

    @GetMapping("/testPost")
    public String testPost() {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<String, Object>();
        params.add("name", getName());

//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity< MultiValueMap<String, Object>> request = new HttpEntity<>(params, null);
        System.out.println(REST_URL_PREFIX + "/sayHello");
        ResponseEntity<String> res = restTemplate.postForEntity(REST_URL_PREFIX + "/sayHello", request, String.class);
        return res.getBody();
    }

    private String getName() {
        List<String> greetings = Arrays.asList("Bob", "Alice", "Jack");
        Random rand = new Random();
        int randomNum = rand.nextInt(greetings.size());
        return greetings.get(randomNum);
    }
}
