package com.skyline.dao.impl;

import com.skyline.dao.UserDao;
import com.skyline.entity.User;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
public class UserDaoImpl implements UserDao {

    private User user = new User(1, "张三");

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "user=" + user +
                '}';
    }

    public User getUser(int id) {
        return user;
    }
}
