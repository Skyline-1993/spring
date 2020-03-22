package com.skyline.util;

import com.skyline.entity.Car;
import com.skyline.entity.Person;
import com.skyline.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // StaticCarFactory carFactory = (StaticCarFactory) applicationContext.getBean("carFactory");
        // Car car = StaticCarFactory.getCar(1);
        // System.out.println(car);
        // Car car = (Car) applicationContext.getBean("car1");
        // System.out.println(car);
        //
        // Car car2 = (Car) applicationContext.getBean("car2");
        // System.out.println(car2);

        Person person = (Person) applicationContext.getBean("person");
        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println(person);
        System.out.println(person2);


    }
}
