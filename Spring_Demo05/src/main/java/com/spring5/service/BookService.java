package com.spring5.service;

import com.spring5.dao.BookDao;
import com.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    public void addBook(Book book){
        bookDao.add(book);
    }
    public void updateBook(Book book){
        bookDao.update(book);
    }
    public void deleteBook(Integer deptno){
        bookDao.delete(deptno);
    }
    public int findCount(){
        return bookDao.find();
    }
    public Book seleOne(Integer deptno){
        return bookDao.seDao(deptno);
    }
    public List<Book> seleAll(){
        return bookDao.seAll();
    }
    public void batchAdd(List<Object[]> list){
        bookDao.batchAddBook(list);
    }
}
