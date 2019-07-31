package com.skyline.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
@Getter
@Setter
public class User {

    private int id;
    private String name;

    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
