package com.skyline.spring;

import com.skyline.spring.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author skyline
 * @date 2021/3/17
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.skyline");
        Person testController = (Person) applicationContext.getBean("wo");
        System.out.println(testController);

    }
}
