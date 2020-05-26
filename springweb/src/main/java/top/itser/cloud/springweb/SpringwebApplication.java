package top.itser.cloud.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient

/**
 *  @author: zhangchen
 *  @Date: 2020/5/4 15:18
 *  @Description: 消费者，消费client的服务
 */
public class SpringwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringwebApplication.class, args);
    }



}
