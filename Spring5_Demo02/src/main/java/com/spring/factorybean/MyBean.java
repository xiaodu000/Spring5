package com.spring.factorybean;

import com.spring.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setCname("aaa");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
