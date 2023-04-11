package com.example.jpatut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repo;
    public String addUser(User user){
        repo.save(user);
        return "User added successfully";
    }
    public List<User> getAllUser(){
        return repo.findAll();
    }
    public User getUserById(int id){
        return repo.findById(id).get();
    }
}
