package com.roopesh.springboot.first.controller;

import com.roopesh.springboot.first.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello Roopesh Saravanan!";
    }

    @RequestMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Roopesh");
        user.setEmail("roopeshsn.dev@gmail.com");
        return user;
    }
}
