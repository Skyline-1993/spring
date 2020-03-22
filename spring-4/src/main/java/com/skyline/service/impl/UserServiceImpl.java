package com.skyline.service.impl;

import com.skyline.dao.UserDao;
import com.skyline.entity.User;
import com.skyline.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
