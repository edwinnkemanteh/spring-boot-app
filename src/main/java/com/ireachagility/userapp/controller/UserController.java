package com.ireachagility.userapp.controller;

import com.ireachagility.userapp.model.User;
import com.ireachagility.userapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Root path to confirm the app is running
    @GetMapping("/")
    public String home() {
        return "Spring Boot App is running!";
    }

    // User endpoints under /users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}

