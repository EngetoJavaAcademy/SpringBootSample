package com.engeto.wedding.controller;

import com.engeto.wedding.model.SayHello;
import com.engeto.wedding.model.User;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    List<User> users = new ArrayList<>();


    @PostMapping("/save")
    public SayHello saveOneSayHello(@RequestBody User user) {
        users.add(user);
        return new SayHello("Hello " + user.getName(), LocalDateTime.now());
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return users;
    }
}
