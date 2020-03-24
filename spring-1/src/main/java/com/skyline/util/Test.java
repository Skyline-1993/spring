package com.skyline.util;

import com.skyline.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过xml配置<bean></bean>的方式创建获取bean对象
 *
 * @author zhangkepeng
 */
public class Test {

    public static void main(String[] args) {

        // 获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 从IOC容器中获取bean对象
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
