package com.jayleo.ebookstorebackend.serviceimpl;

import com.jayleo.ebookstorebackend.dao.UserDao;
import com.jayleo.ebookstorebackend.entity.User;
import com.jayleo.ebookstorebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findByUserId(Integer userId) {
        return userDao.findByUserId(userId);
    }

    @Override
    public User findByUserName(String username) {
        return userDao.findByUsername(username);
    }


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

}