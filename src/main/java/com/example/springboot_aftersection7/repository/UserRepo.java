package com.example.springboot_aftersection7.repository;

import com.example.springboot_aftersection7.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepo extends JpaRepository<UserEntity, Integer> {

    // Derived Queries
    List<UserEntity> findAllByLastName(String lastName);

    List<UserEntity> findAllByFirstNameStartingWith(String c);

    List<UserEntity> findAllByFirstNameEndingWith(String c);

    List<UserEntity> findAllByFirstNameAndLastName(String firstName, String lastName);

    List<UserEntity> findAllByFirstName(String firstName);

    List<UserEntity> getAllByFirstName(String firstName);

    List<UserEntity> readAllByFirstName(String firstName);


}
