package com.atqin.spring5.testdemo;

import com.atqin.spring5.Book;
import com.atqin.spring5.Orders;
import com.atqin.spring5.User;
import com.atqin.spring5.service.UserService;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void  testAdd(){

        //1.加载配置文件

        ApplicationContext contest=
                new ClassPathXmlApplicationContext("bean1.xml");


        //2 获取配置创建的对象

        User user = contest.getBean("user", User.class);
        System.out.println(user);
        user.add();


    }
    @Test
    public void  testBook1() {

        //1.加载配置文件

        ApplicationContext contest =
                new ClassPathXmlApplicationContext("bean1.xml");


        //2 获取配置创建的对象

        Book book = contest.getBean("book", Book.class);
        System.out.println(book);
        book.test();
    }
    @Test
    public void  testOrder() {

        //1.加载配置文件

        ApplicationContext contest =
                new ClassPathXmlApplicationContext("bean1.xml");


        //2 获取配置创建的对象

        Orders orders = contest.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.test();

    }

    @Test
    public void  testUserdao() {

        UserService userService = new UserService();
        userService.add();
    }



}