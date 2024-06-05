package com.jayleo.ebookstorebackend.service;

import com.jayleo.ebookstorebackend.entity.User;

import java.util.List;
import java.util.Map;


public interface UserService {
    User findByUserId(Integer userId);

    User findByUserName(String userName);

    List<User> findAll();
}