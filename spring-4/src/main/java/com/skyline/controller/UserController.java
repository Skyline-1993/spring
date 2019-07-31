package com.skyline.controller;

import com.skyline.entity.User;
import com.skyline.service.UserService;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String toString() {
        return "UserController{" +
                "userService=" + userService +
                '}';
    }

    public User getUser(int id) {
        User user = userService.getUser(id);
        return user;
    }
}
