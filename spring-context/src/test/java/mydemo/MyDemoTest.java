package mydemo;

import org.junit.Test;
import org.springframework.bo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <15818589952@163.com>
 * Date:   2019/8/20
 */
public class MyDemoTest {

    @Test
    public void testApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");

        Person person = context.getBean(Person.class);

        System.out.println(person.work());
    }

}
