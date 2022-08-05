package mb.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Author mabo
 * @Date 2022/8/5 19:59
 */
@RestController
public class HelloController {
    @Resource
    private DataSource dataSource;

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello SpringBoot</br>" + dataSource.getClass().toString();
    }
}
