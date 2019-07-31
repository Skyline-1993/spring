package com.skyline.util;

import com.skyline.controller.UserController;
import com.skyline.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        User user = userController.getUser(1);
        System.out.println(user);


    }
}
