package spring.mvc.dao;

import org.springframework.stereotype.Repository;
import spring.mvc.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
