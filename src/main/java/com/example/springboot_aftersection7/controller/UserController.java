package com.example.springboot_aftersection7.controller;

import com.example.springboot_aftersection7.dto.UserDao;
import com.example.springboot_aftersection7.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping(path = "/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return userDao.getAllUsers();
    }

    @GetMapping(path = "/getAllByLastName")
    public List<UserEntity> getAllByLastName(@RequestParam String lastName) {
        return userDao.getAllByLastName(lastName);
    }

    @GetMapping(path = "/findAllByFirstNameStartingWith")
    public List<UserEntity> findAllByFirstNameStartingWith(@RequestParam String starting) {
        return userDao.findAllByFirstNameStartingWith(starting);
    }

    @GetMapping(path = "/findAllByFirstNameEndingWith")
    public List<UserEntity> findAllByFirstNameEndingWith(@RequestParam String ending) {
        return userDao.findAllByFirstNameEndingWith(ending);
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public HashMap<String, String> lengthError(Integer length) {
        HashMap<String, String> msg = new HashMap<String, String>();
        msg.put("mes", "the length of the name must by less then " + length);
        return msg;
    }

    @GetMapping(path = "/findAllByFirstName")
    public Object findAllByFirstName(@RequestParam String firstName) {
        if (firstName.length() > 30) {
            HashMap<String, String> msg = new HashMap<>();
            msg.put("msg", "the length of the name must by less then 30 characters");
        }
        return userDao.findAllByFirstName(firstName);
    }

    @GetMapping(path = "/getAllByFirstName")
    public List<UserEntity> getAllByFirstName(@RequestParam String firstName) {
        return userDao.getAllByFirstName(firstName);
    }

    @GetMapping(path = "/readAllByFirstName")
    public List<UserEntity> readAllByFirstName(@RequestParam String firstName) {
        return userDao.readAllByFirstName(firstName);
    }


}
