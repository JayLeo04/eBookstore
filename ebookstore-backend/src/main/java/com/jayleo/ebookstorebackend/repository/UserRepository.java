package com.jayleo.ebookstorebackend.repository;

import com.jayleo.ebookstorebackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    User findByUserId(Integer userId);
}
