package com.skyline.spring.controller;

import com.skyline.spring.component.Person;
import com.skyline.spring.entity.User;
import com.skyline.spring.service.UserService;
import com.skyline.spring.util.ApplicationContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息操作
 *
 * @author zhangkepepng
 * @date 2019-7-31
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public User getUser(int id) {
        return userService.getUser(id);
    }

    @RequestMapping("/getBean")
    public Person getUserService() {
        Person person = (Person) ApplicationContextUtil.getBean("person");
        System.out.println(person);
        return person;
    }
}
