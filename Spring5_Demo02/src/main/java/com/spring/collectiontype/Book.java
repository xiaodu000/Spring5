package com.spring.collectiontype;

import java.util.List;

public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
    public void methods(){
        System.out.println(list);
    }
}

