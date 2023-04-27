package com.example.springboot_aftersection7.repository;

import com.example.springboot_aftersection7.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
