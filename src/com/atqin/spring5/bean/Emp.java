package com.atqin.spring5.bean;

//员工类
public class Emp {

    private String ename;
    private String gender;

    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public  void add(){
        System.out.println("Emp add:  "+ename+" : "+gender+" : "+dept);
    }
}
