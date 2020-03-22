package com.skyline.controller;

import com.skyline.entity.User;
import com.skyline.service.UserService;

public class UserController {

    private UserService userService;

    public User getUser(int id) {
        return userService.getUser(id);
    }
}
