package com.atqin.spring5.dao;

import com.atqin.spring5.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{


    //注入JDBC Template
    @Autowired
    private JdbcTemplate jdbcTemplate ;

    @Override
    public void add(Student student) {

        //sql语句
        String sql = "insert into student values(?,?,?,?)";
        //影响行数 改变多少行
        Object[] args = { student.getId(), student.getName(), student.getAge(), student.getSex()};
        int update = jdbcTemplate.update(sql,args);


        System.out.println(update);
    }

    @Override
    public void updataStudent(Student student) {

        //sql语句
        String sql = "update student set name=?,age=? where id=?";
        //影响行数 改变多少行
        Object[] args = { student.getName(), student.getAge(),student.getId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);

    }

    @Override
    public void deleteStudent(int id) {

        //sql语句
        String sql = "delete from student where id=?";
        int delete = jdbcTemplate.update(sql,id);
        System.out.println(delete);
    }

}
