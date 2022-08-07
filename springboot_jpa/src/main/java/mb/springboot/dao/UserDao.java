package mb.springboot.dao;

import mb.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author mabo
 * @Date 2022/8/7 18:08
 */
public interface UserDao extends JpaRepository<User, Integer> {

}
