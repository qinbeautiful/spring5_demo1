package com.atqin.spring5.testdemo;

import com.atqin.spring5.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanAop.xml");
        User user = context.getBean("user", User.class);
        user.add();

    }
}
