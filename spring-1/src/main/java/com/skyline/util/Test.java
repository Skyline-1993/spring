package com.skyline.util;

import com.skyline.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student stu1 = (Student)applicationContext.getBean("stu1");
        Student stu1_1 = (Student)applicationContext.getBean("stu1");
        Student stu2 = (Student)applicationContext.getBean("stu2");
        Student stu3 = (Student)applicationContext.getBean("stu3");
        Student stu3_1 = (Student)applicationContext.getBean("stu3_1");
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu3_1);
        System.out.println(stu1 == stu1_1);
        
    }
}
