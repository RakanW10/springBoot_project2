package com.example.springboot_aftersection7.dto;

import com.example.springboot_aftersection7.entity.UserEntity;
import com.example.springboot_aftersection7.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDao {
    @Autowired
    private UserRepo userRepo;

    public List<UserEntity> getAllUsers(){
        return userRepo.findAll();
    }
}
