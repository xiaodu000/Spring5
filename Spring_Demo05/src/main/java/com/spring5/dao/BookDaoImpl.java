package com.spring5.dao;

import com.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql="insert into dept values(?,?,?)";
        int update = jdbcTemplate.update(sql, book.getDeptno(),book.getDname(),book.getLocid());
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql="update dept set dname=?,locid=? where deptno=?";
        Object[] args={book.getDname(),book.getDname(),book.getDeptno()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(Integer deptno) {
        String sql="delete from dept where deptno=?";
        int update = jdbcTemplate.update(sql, deptno);
        System.out.println(update);
    }

    @Override
    public int find() {
        String sql="select count(*) from dept";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public Book seDao(Integer deptno) {
        String sql="select * from dept where deptno=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), deptno);
        return book;
    }

    @Override
    public List<Book> seAll() {
        String sql="select * from dept";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

    @Override
    public void batchAddBook(List<Object[]> list) {
        String sql="insert into dept values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }
}
