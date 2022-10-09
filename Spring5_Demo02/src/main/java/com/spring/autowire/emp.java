package com.spring.autowire;

public class emp {
    private dept dept;

    @Override
    public String toString() {
        return "emp{" +
                "dept=" + dept +
                '}';
    }

    public void setDept(com.spring.autowire.dept dept) {
        this.dept = dept;
    }
    public void test(){
        System.out.println(dept);
    }
}
