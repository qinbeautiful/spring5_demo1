package com.atqin.spring5.service;

import com.atqin.spring5.dao.BookDao;
import com.atqin.spring5.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //注入Dao
    @Autowired
    public BookDao bookDao;

    //添加方法
    public void addStudent(Student student){
        bookDao.add(student);
    }
    //修改方法
    public void updataStudent(Student student){
        bookDao.updataStudent(student);
    }

    //删除方法
    public void deleteStudent(int id){

        bookDao.deleteStudent(id);
    }
}
