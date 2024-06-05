package com.jayleo.ebookstorebackend.dao;

import com.jayleo.ebookstorebackend.entity.User;
import com.jayleo.ebookstorebackend.entity.UserAuth;

import java.util.List;

public interface UserDao {
    User findByUserId(Integer id);
    User findByUsername(String username);
    void save(User user);

    List<User> findAll();

    void saveUserAuth(UserAuth userAuth);
}
