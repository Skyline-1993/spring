package com.skyline.controller;

import com.skyline.entity.User;
import com.skyline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
// Spring提供了四个注解@Controller、@Service、@Repository、@Component来初始化bean.
// 其实这四个注解实质是同一个注解@Component
// 不过与配置文件中配置<bean>标签方式初始化bean不同的是，注解的方式给属性赋值的时候是通过反射机制赋值，不用setter方法。
// 但是配置文件中配置<bean>标签的方式是通过setter方法对属性进行赋值，故实体类中需要setter方法
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public User getUser(int id) {
        User user = userService.getUser(id);
        return user;
    }
}
