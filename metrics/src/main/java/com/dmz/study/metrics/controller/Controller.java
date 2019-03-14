package com.dmz.study.metrics.controller;

import com.sensorsdata.analytics.javasdk.SensorsAnalytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dmz
 * @date Create in 22:59 2019/3/3
 */
@RestController
@RequestMapping("/metrics")
public class Controller {

    @Autowired
    private SensorsAnalytics sensorsAnalytics;

    @RequestMapping("/test01")
    public String test01() throws Exception {
        String distinctId = "USER001";
        boolean isLoginId = true;
        String eventName = "click button";
        Map<String, Object> properties = new HashMap();
        properties.put("name", "张三");
        properties.put("age", 21);
        //properties.put("referrer", new User("张三推荐人", "男", 30));
        sensorsAnalytics.track(distinctId, isLoginId, eventName, properties);
        return "test01--------hello metrics！！！";
    }

    @RequestMapping("/test02")
    public String test02() {
        return "test02--------hello metrics！！！";
    }
}
