package com.atqin.spring5.testdemo;

import com.atqin.spring5.config.SpringConfig;
import com.atqin.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestZJ {

    @Test
    public void test01(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanSM.xml");

        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();


    }
    @Test
    public void test02(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();


    }


}
