package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduce() {
        String sql="update dept set locid=locid-? where deptno=?";
        int update = jdbcTemplate.update(sql, 100, 88);
        System.out.println(update);
    }

    @Override
    public void add() {
        String sql="update dept set locid=locid+? where deptno=?";
        int update = jdbcTemplate.update(sql, 100, 89);
        System.out.println(update);
    }
}
