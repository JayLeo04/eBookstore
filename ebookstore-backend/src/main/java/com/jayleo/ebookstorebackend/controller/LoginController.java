package com.jayleo.ebookstorebackend.controller;


import com.jayleo.ebookstorebackend.entity.User;
import com.jayleo.ebookstorebackend.entity.UserAuth;
import com.jayleo.ebookstorebackend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Scope("session")
@CrossOrigin(originPatterns = "*", allowCredentials = "true")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/api/login")
    public Map<String, Object> login(@RequestBody Userlogin user) {
        Map<String, Object> result = new HashMap<>();
        User user1 = loginService.findByUsername(user.username);
        if (user1 != null) {
            if (user1.getStatus().equals("banned")) {
                result.put("status", 400);
                result.put("message", "该用户已被禁用");
                return result;
            }
            UserAuth userauth = loginService.findByUserAuthId(user1.getUserId());
            if (Objects.equals(userauth.getPassword(), user.password)) {
                result.put("status", 200);
                result.put("message", "Login Success");
                return result;
            }
            result.put("status", 400);
            result.put("message", "Wrong Password!");
        } else {
            result.put("status", 400);
            result.put("message", "The user does not exist!");
        }
        return result;
    }

    @RequestMapping("/api/logout")
    public String  logout(@RequestBody Map<String, Object> username) {
        return "Logout Success!";
    }
    static class Userlogin {
        public String username;
        public String password;
    }
}
