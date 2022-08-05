package com.atguigu.controller;

import com.atguigu.properties.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author mabo
 * @Date 2022/8/3 13:25
 */
@RestController
/*
    因为在HelloController中声明了DataSourceProperties对象，若DataSourceProperties类上还没有@Component注解
    则@EnableConfigurationProperties(DataSourceProperties.class)必须标注在HelloController类上
    不加注解出现以下错误
        A component required a bean of type 'com.atguigu.properties.DataSourceProperties' that could not be found.
        Consider defining a bean of type 'com.atguigu.properties.DataSourceProperties' in your configuration.
*/
@EnableConfigurationProperties(DataSourceProperties.class)
public class HelloController {
//    @Autowired
    @Resource
    private DataSourceProperties dataSourceProperties;

    @RequestMapping("/hello")
    public String sayHello() {
        return dataSourceProperties.toString();
    }
}
