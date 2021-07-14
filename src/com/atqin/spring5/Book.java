package com.atqin.spring5;

public class Book {

    private String bname;
    private int age;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void test(){
        System.out.println(bname +"::"+ age);
    }


}
