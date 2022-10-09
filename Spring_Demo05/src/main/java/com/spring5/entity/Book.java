package com.spring5.entity;

public class Book {
    private Integer deptno;
    private String dname;
    private Integer locid;

    @Override
    public String toString() {
        return "Book{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", locid=" + locid +
                '}';
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getLocid() {
        return locid;
    }

    public void setLocid(Integer locid) {
        this.locid = locid;
    }
}
