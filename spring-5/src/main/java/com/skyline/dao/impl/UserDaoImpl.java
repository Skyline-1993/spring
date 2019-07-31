package com.skyline.dao.impl;

import com.skyline.dao.UserDao;
import com.skyline.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
@Repository
public class UserDaoImpl implements UserDao {

    private User user = new User(1, "张三");

    public User getUser(int id) {
        return user;
    }
}
