package com.spring5.dao;

import com.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);

    void update(Book book);

    void delete(Integer deptno);

    int find();

    Book seDao(Integer deptno);

    List<Book> seAll();

    void batchAddBook(List<Object[]> list);
}
