package com.atqin.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect //生产代理对象
//增强的类
public class UserProxy {

    //前置通知
    @Before(value = "execution(* com.atqin.spring5.aopanno.User.add(..))")
    public void  before(){
        System.out.println("before....");
    }


}
