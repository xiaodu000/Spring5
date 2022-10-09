package com.spring.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class UserDaoImpl implements UserDao{
    @Override
    public void me() {
        System.out.println("userdao.......");
    }
}
