package top.itser.cloud.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RestTemplate restTemplateNoBalance;

    @GetMapping("nonbalanced/get")
    public String getProvider1(){
        return  restTemplateNoBalance.getForObject("http://localhost:8762/hi",String.class);
    }

    @GetMapping("balanced/get")
    public String getProvider2(){
        //ip 使用应用名
        return  restTemplate.getForObject("http://service-hi/hi",String.class);
    }

    @Bean
    @LoadBalanced //ribbon 负载均衡
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Bean //无负载均衡
    public RestTemplate restTemplateNoBalance(){
        return  new RestTemplate();
    }
}

