package com.example.springboot_aftersection7.controller;

import com.example.springboot_aftersection7.dto.UserDao;
import com.example.springboot_aftersection7.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping(path = "/getAllUsers")
    public List<UserEntity> getAllUsers(){
        return userDao.getAllUsers();
    }
}
