package com.jayleo.ebookstorebackend.dao;

import com.jayleo.ebookstorebackend.entity.UserAuth;
import com.jayleo.ebookstorebackend.entity.User;

public interface LoginDao {
    User findByUsername(String username);
    UserAuth findByUserAuthId(Integer id);
}
