package com.baoge.service;

import com.baoge.entity.User;
import org.springframework.stereotype.Service;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/18
 */

//@Service
//public class UserServiceImpl implements UserService {

@Service("userService")
public class UserServiceImpl {

//    @Override
    public User login(int userId) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new User(userId, "豹哥");
    }
}
