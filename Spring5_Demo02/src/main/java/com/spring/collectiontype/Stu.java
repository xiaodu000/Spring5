package com.spring.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
//    1.字符串数组
    private String[] courses;
//    2.list集合类型属性
    private List<String> list;
//    3.map集合类型属性
    private Map<String,String> maps;
//    4.set集合
    private Set<String> sets;
    //学生所学多门课程
    private List<Course> listcou;

    public void setListcou(List<Course> listcou) {
        this.listcou = listcou;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
    public void methods(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(listcou);
    }
}
