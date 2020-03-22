package com.skyline.entity;

import lombok.Data;

@Data
public class Student {

    private int id;
    private String name;
    private int age;
    private Classes classes;

    public Student() {
        System.out.println("执行空构造");
    }

}
