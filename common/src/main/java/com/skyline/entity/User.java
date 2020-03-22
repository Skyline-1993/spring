package com.skyline.entity;

import lombok.Data;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
@Data
public class User {

    private int id;
    private String name;

    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
