package com.spring.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //生成代理对象
public class UserProxy {
    @Pointcut("execution(* com.spring.demo1.User.me(..))")
    public void cut(){

    }
    @Before("cut()")
    public void before(){
        System.out.println("before...................");
    }
    @Around("cut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around环绕之前............");
        proceedingJoinPoint.proceed();
        System.out.println("around环绕之后............");
    }
}
