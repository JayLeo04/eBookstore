package com.jayleo.ebookstorebackend.repository;

import com.jayleo.ebookstorebackend.entity.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthRepository extends JpaRepository<UserAuth, Integer> {
        UserAuth findByUserId(Integer id);
}
