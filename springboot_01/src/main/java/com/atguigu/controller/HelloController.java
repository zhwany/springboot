package com.atguigu.controller;

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
    @RequestMapping("/hello")
    public Map sayHello() {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        map.put("hello1", "springboot");
        return map;
    }
}
