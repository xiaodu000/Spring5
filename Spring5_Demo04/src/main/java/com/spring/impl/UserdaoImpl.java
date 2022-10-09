package com.spring.impl;

import com.spring.dao.Userdao;

public class UserdaoImpl implements Userdao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了...........");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了。。。。。。。。。。。。。。。");
        return id;
    }
}
