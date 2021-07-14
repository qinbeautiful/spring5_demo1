package com.atqin.spring5.testdemo;

import com.atqin.spring5.entity.Student;
import com.atqin.spring5.service.BookService;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class TestMysql {

    
    @Test
    public void  addMysql(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanMysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Student student = new Student();
        student.setId(13);
        student.setName("hh");
        student.setAge(10);
        student.setSex("1");
        bookService.addStudent(student);
    }

    @Test
    public void  updataMysql(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanMysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Student student = new Student();
        student.setName("dada");
        student.setAge(20);
        student.setId(10);
        bookService.updataStudent(student);
    }

    @Test
    public void  deletaMysql(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanMysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        bookService.deleteStudent(1);
//        bookService.updataStudent(student);
    }


}
