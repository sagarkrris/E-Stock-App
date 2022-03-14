package com.stockmarket.services;

import com.stockmarket.entities.User;
import com.stockmarket.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByName(String name) {
        return this.userRepository.findByName(name);
    }

    public void saveUser(User user) {
        user.setDate(new Date(System.currentTimeMillis()));
        this.userRepository.save(user);
    }
}
