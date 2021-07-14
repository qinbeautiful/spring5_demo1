package com.atqin.spring5.testdemo;

import com.atqin.spring5.User;
import com.atqin.spring5.bean.Emp;
import com.atqin.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void  testAdd(){

        //1.加载配置文件

        ApplicationContext contest=
                new ClassPathXmlApplicationContext("bean2.xml");


        //2 获取配置创建的对象

        UserService userService = contest.getBean("userService", UserService.class);

        userService.add();

    }

    @Test
    public void  testBean3(){

        //1.加载配置文件

        ApplicationContext contest=
                new ClassPathXmlApplicationContext("bean3.xml");


        //2 获取配置创建的对象

        Emp emp = contest.getBean("emp", Emp.class);

        emp.add();

    }

}
