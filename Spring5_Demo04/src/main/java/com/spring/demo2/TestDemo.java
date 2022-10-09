package com.spring.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = con.getBean("book", Book.class);
        book.buy();
    }
}
