package com.dmz.study.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dmz
 * @date Create in 21:13 2019/3/5
 */
@RestController
@RequestMapping("/web")
public class Controller {
    @RequestMapping("/test01")
    public String test01() {
        return "hello eureka!";
    }
}
