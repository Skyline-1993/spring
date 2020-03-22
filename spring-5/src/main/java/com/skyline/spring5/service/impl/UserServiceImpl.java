package com.skyline.spring5.service.impl;

import com.skyline.entity.User;
import com.skyline.spring5.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zhangkepeng
 * @date 2019/7/27
 */
@Service
public class UserServiceImpl implements UserService {

    private User user = new User(2, "张三");

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
