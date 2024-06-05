package com.jayleo.ebookstorebackend.serviceimpl;

import com.jayleo.ebookstorebackend.dao.LoginDao;
import com.jayleo.ebookstorebackend.entity.User;
import com.jayleo.ebookstorebackend.entity.UserAuth;
import com.jayleo.ebookstorebackend.repository.UserAuthRepository;
import com.jayleo.ebookstorebackend.repository.UserRepository;
import com.jayleo.ebookstorebackend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("session")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
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
