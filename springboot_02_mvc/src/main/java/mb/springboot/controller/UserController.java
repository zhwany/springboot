package mb.springboot.controller;

import mb.springboot.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mabo
 * @Date 2022/8/6 11:02
 */
/*
    向页面发送数据，二选一
    1、@Controller + @ResponseBody
    2、@RestController
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/findAll")
//    @ResponseBody
    public List<User> findAll() {
        List<User> user = new ArrayList<>();

        User user1 = new User();
        user1.setUsername("杨过");
        user1.setPassword("123456");
        user1.setAge(18);
        user1.setSex("男");

        User user2 = new User();
        user2.setUsername("杨过");
        user2.setPassword("123456");
        user2.setAge(18);
        user2.setSex("男");

        User user3 = new User();
        user3.setUsername("杨过");
        user3.setPassword("123456");
        user3.setAge(18);
        user3.setSex("男");

        user.add(user1);
        user.add(user2);
        user.add(user3);

        return user;
    }
}
