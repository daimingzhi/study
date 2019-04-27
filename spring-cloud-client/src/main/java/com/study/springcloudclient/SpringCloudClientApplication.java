package com.study.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello() throws Exception{
        return "hello,eureka~";
    }
}
