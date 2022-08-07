package mb.springboot.service;

import mb.springboot.domain.User;

import java.util.List;

/**
 * @Author mabo
 * @Date 2022/8/7 18:09
 */
public interface UserService {
    List<User> findUsers();

    User findUserById(Long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);
}
