package top.itser.cloud.eurekaclientzs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController

/**
 *  @author: zhangchen
 *  @Date: 2020/5/4 15:19
 *  @Description: 服务提供者
 */
public class EurekaClientlsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientlsApplication.class, args);
    }

    @Value("${server.port}")
    int clientPort;

    @GetMapping("hi")
    public String hi(){
        return "hello eureka client:" +clientPort;
    }

}
