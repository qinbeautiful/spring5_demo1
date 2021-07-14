package com.atqin.spring5.testdemo;

import com.atqin.spring5.coll.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSj {

    @Test
    public void test01(){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanSZ.xml");

        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }
}
