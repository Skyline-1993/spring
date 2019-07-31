package com.skyline.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Person {

    private int id;
    private String user;
    private Car car;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", car=" + car +
                '}';
    }
}
