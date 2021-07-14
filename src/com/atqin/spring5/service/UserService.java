package com.atqin.spring5.service;

import com.atqin.spring5.dao.UserDao;
import com.atqin.spring5.dao.UserDaoImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component(value = "userService")
//@Service
public class UserService {

    /*//创建 UserDao 类型属性，生成 set 方法
     private UserDao userDao;
     public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
     }*/


    public  void  add(){
        System.out.println("service add...");
//        userDao.update();


        //原始方式创建UserDao对象
//        UserDao userdao = new UserDaoImpl();
//        userdao.update();



    }

}
