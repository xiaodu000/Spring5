package com.spring.service;

import com.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("userService")
public class UserService {
    @Autowired
    private UserDao userDao;
    public void methods(){
        System.out.println("userservice。。。。。");
        userDao.me();
    }
}
