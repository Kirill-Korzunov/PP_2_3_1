package spring.mvc.service;

import spring.mvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void add(User user);
}
