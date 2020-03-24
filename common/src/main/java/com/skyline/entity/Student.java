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

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
