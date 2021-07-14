package com.atqin.spring5.dao;

import com.atqin.spring5.entity.Student;


public interface BookDao {

    void add(Student student);

    void updataStudent(Student student);

    void deleteStudent(int id);

}
