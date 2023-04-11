package com.example.jpatut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/getUsers")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id")int id){
        return userService.getUserById(id);
    }
}
