package com.jayleo.ebookstorebackend.daoimpl;


import com.jayleo.ebookstorebackend.dao.LoginDao;
import com.jayleo.ebookstorebackend.entity.User;
import com.jayleo.ebookstorebackend.entity.UserAuth;
import com.jayleo.ebookstorebackend.repository.UserRepository;
import com.jayleo.ebookstorebackend.repository.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAuthRepository userAuthRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public UserAuth findByUserAuthId(Integer id) {
        return userAuthRepository.findByUserId(id);
    }
}
