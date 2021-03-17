package com.skyline.spring.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author skyline
 * @date 2021/3/17
 */
@Component
@Data
public class Person {

    private String name;
    private int age;

}
