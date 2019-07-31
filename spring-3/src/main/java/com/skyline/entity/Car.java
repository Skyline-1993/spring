package com.skyline.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private int num;
    private String brand;

    public Car() {

    }

    public Car(int num, String brand) {
        this.num = num;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "num=" + num +
                ", brand='" + brand + '\'' +
                '}';
    }
}
