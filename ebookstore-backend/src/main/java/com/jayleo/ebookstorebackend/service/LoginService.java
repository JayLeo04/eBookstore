package com.jayleo.ebookstorebackend.service;

import com.jayleo.ebookstorebackend.entity.User;
import com.jayleo.ebookstorebackend.entity.UserAuth;

public interface LoginService {
    User findByUsername(String username);
    UserAuth findByUserAuthId(Integer id);
}