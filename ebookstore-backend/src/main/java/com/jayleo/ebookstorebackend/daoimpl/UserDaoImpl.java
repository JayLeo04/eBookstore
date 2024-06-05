package com.jayleo.ebookstorebackend.daoimpl;

import com.jayleo.ebookstorebackend.dao.UserDao;
import com.jayleo.ebookstorebackend.entity.User;
import com.jayleo.ebookstorebackend.entity.UserAuth;
import com.jayleo.ebookstorebackend.repository.UserAuthRepository;
import com.jayleo.ebookstorebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserAuthRepository userauthRepository;


    @Override
    public User findByUserId(Integer id) {
        return userRepository.findByUserId(id);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void saveUserAuth(UserAuth userAuth) {
        userauthRepository.save(userAuth);
    }
}