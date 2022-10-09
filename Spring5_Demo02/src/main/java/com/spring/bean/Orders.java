package com.spring.bean;

public class Orders {
    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                '}';
    }
}
