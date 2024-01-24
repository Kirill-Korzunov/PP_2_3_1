package spring.mvc.dao;

import spring.mvc.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void add(User user);
}
