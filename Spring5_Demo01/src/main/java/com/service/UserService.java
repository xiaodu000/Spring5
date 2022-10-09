package com.service;

import com.dao.UserDao;

public class UserService {
    private UserDao userdao;

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    public void AAA(){
        System.out.println("UserService.............");
        userdao.methods();
    }
}
