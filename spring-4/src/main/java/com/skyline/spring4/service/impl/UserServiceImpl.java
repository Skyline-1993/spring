package com.skyline.spring4.service.impl;

import com.skyline.entity.User;
import com.skyline.spring4.service.UserService;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
public class UserServiceImpl implements UserService {

    private User user = new User(1, "张三");


    public User getUser(int id) {
        return user;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "user=" + user +
                '}';
    }
}
