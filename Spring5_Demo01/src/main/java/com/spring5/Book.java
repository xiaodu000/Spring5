package com.spring5;

/**
 * 1.使用set方法进行注入
 */
public class Book {
    private String bname;
    private Integer price;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void pp(){
        System.out.println(bname+"::"+price+"::"+address);
    }
}
