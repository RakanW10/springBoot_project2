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

    // using Derived Queries
    public  List<UserEntity> getAllByLastName(String lastName){
        return userRepo.findAllByLastName(lastName);
    }

    public  List<UserEntity> findAllByFirstNameStartingWith(String starting){
        return userRepo.findAllByFirstNameStartingWith(starting);
    }

    public  List<UserEntity> findAllByFirstNameEndingWith(String ending){
        return userRepo.findAllByFirstNameEndingWith(ending);
    }

    public List<UserEntity> findAllByFirstName(String firstName){
        return userRepo.findAllByFirstName(firstName);
    }


    public List<UserEntity> getAllByFirstName(String firstName){
        return userRepo.getAllByFirstName(firstName);
    }

    public List<UserEntity> readAllByFirstName(String firstName){
        return userRepo.readAllByFirstName(firstName);
    }
}
