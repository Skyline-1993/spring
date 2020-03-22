package com.skyline.spring4.util;

import com.skyline.spring4.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
public class Test {

    public static void main(String[] args) {

        // 获取spring上下文（spring容器）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 从spring容器中获取userController对象（userController已通过spring.xml的@Bean配置加载到spring容器中）
        UserController userController = (UserController) applicationContext.getBean("userController");

        System.out.println(userController);

    }
}
