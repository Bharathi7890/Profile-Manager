package com.example.Learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Learning.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
