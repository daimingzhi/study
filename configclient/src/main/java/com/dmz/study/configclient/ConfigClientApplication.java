package com.dmz.study.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dmz
 */
@SpringBootApplication
@RestController
@RequestMapping("/config")
public class ConfigClientApplication {

    @Value("${name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @RequestMapping("/demo01")
    public void get() {
        System.out.println(name);
    }
}
