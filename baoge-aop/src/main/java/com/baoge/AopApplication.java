package com.baoge;

import com.baoge.service.UserService;
import com.baoge.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/18
 */

@EnableAspectJAutoProxy
@ComponentScan("com.baoge.*")
public class AopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopApplication.class);
//        UserService userService = context.getBean(UserService.class);

        // 将UserServiceImpl修改不实现接口类UserService，则Spring底层用CGLIB代理，若是实现接口则用JDK代理
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.login(1);
    }

}
