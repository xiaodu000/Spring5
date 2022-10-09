package com.bean;

public class Dept {
    private String dname;

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
