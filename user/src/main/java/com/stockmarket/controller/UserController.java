package com.stockmarket.controller;


import com.stockmarket.entities.User;
import com.stockmarket.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("user/{userName}")
    public User getUserByName(@PathVariable String userName) {
        return this.userService.getUserByName(userName);
    }

    @PostMapping("saveUser")
    public void saveUser(@RequestBody User user) {
        this.userService.saveUser(user);
    }

}
