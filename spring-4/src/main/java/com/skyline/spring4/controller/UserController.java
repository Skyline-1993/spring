package com.skyline.spring4.controller;

import com.skyline.spring4.service.UserService;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
public class UserController {

    private UserService userService;



    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String toString() {
        return "UserController{" +
                "userService=" + userService +
                '}';
    }

}
