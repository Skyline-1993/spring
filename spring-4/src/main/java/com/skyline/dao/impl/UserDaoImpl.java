package com.skyline.dao.impl;

import com.skyline.dao.UserDao;
import com.skyline.entity.User;

public class UserDaoImpl implements UserDao {

    User user = new User(1, "聂风");


    public User getUser(int id) {
        return user;
    }
}
