package com.spring5Test;

import com.bean.Emp;
import com.service.UserService;
import com.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest2 {
    @Test
    public void UserTest(){
        //加载配置文件
        ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext("bean2.xml");
        //获取配置创建的对象
        UserService userservice = contest.getBean("userservice", UserService.class);
        userservice.AAA();
    }
    @Test
    public void BeanTest(){
        //加载配置文件
        ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext("bean2.xml");
        //获取配置创建的对象
        Emp emp = contest.getBean("emp", Emp.class);
        emp.methods();
    }
}
