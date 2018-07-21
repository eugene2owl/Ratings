package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Override
    public User getUserById(int id) {
        User user = new User();
        user.setUsername("Eugene");
        return user;
    }
}
