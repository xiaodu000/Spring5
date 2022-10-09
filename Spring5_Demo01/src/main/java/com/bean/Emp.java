package com.bean;

public class Emp {
    private String name;
    private String sex;
    private Dept dept;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void methods(){
        System.out.println(name+"::"+sex+"::"+dept);
    }
}
