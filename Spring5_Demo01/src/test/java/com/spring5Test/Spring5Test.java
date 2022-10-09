package com.spring5Test;

import com.spring5.Book;
import com.spring5.Orders;
import com.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test {
    @Test
    public void AddTest(){
        //加载配置文件
        ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        User user = contest.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void BookTest1(){
        //加载配置文件
        ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        Book book = contest.getBean("book", Book.class);
        book.pp();
    }
    @Test
    public void OrdersTest1(){
        //加载配置文件
        ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        Orders orders = contest.getBean("orders", Orders.class);
        orders.methods();
    }
}
