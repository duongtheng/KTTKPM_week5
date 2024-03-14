package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/orders")
public class UserController {
    private final UserRepository userRepository;

    @GetMapping
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
    @PostMapping("")
    public User createUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public List<User> getOrdersByUserId(@PathVariable("id") Long id) {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users.stream().filter(x -> x.getId().equals(id)).toList();
    }
}