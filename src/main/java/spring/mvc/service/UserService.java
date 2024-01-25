package spring.mvc.service;

import spring.mvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void add(User user);

    User getUser(Long id);

    void update(User user);

    void deleteById(Long id);
}
