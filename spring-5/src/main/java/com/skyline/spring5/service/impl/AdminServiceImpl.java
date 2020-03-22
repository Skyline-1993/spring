package com.skyline.spring5.service.impl;

import com.skyline.entity.User;
import com.skyline.spring5.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zhangkepeng
 */
@Service
public class AdminServiceImpl implements UserService {

    private User user = new User(1, "管理员");

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
