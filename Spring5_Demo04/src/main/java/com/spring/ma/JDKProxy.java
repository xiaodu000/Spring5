package com.spring.ma;

import com.spring.dao.Userdao;
import com.spring.impl.UserdaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces={Userdao.class};
        UserdaoImpl userdao = new UserdaoImpl();
        Userdao o = (Userdao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userdao));
//        int add = o.add(1, 3);
//        System.out.println(add);
        String aa = o.update("aa");
        System.out.println(aa);

    }


    static class UserDaoProxy implements InvocationHandler{
        Object obj;

        public UserDaoProxy(Object obj) {
            this.obj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName()+"方法执行之前");

            Object invoke = method.invoke(obj, args);

            System.out.println(method.getName()+"方法执行之后");

            return invoke;
        }
    }
}
