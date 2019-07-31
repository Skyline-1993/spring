package com.skyline.service.impl;

import com.skyline.dao.UserDao;
import com.skyline.entity.User;
import com.skyline.service.UserService;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userDao=" + userDao +
                '}';
    }

    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
