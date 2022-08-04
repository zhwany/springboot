package com.atguigu.controller;

import com.atguigu.properties.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author mabo
 * @Date 2022/8/3 13:25
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String sayHello() {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        map.put("hello1", "springboot");
        return map.toString();
    }

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @RequestMapping("/hello")
    public String sayHello2() {
        return dataSourceProperties.toString();
    }

    @RequestMapping("/hello1")
    public DataSourceProperties sayHello3() {
        return dataSourceProperties;
    }
}
