package com.jayleo.ebookstorebackend.intercreptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthIntercreptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().equals("/api/login")) {
            return true;
        }

        Object user = request.getSession().getAttribute("user");
        if (user == null) {
            response.setStatus(401);
            return false;
        }

        return true;
    }
}
