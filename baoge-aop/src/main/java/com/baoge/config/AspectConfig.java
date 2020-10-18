package com.baoge.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/18
 */

@Aspect
@Component
public class AspectConfig {

    @Pointcut("execution(* com.baoge.service.*.*(..))")
    private void pointcut() {

    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = point.proceed();

        System.out.println("消耗时间：" + (System.currentTimeMillis() - startTime));

        return result;
    }

}
