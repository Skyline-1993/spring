package com.skyline.spring.dao.impl;

import com.skyline.spring.dao.UserDao;
import com.skyline.spring.entity.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author zhangkepepng
 * @date 2019-7-31
 */
@Repository
public class UserDaoImpl implements UserDao {

    User user = new User();

    @Override
    public User getUser(int id) {
        return user;
    }
}
