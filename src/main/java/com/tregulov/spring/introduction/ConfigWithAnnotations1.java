package com.tregulov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat cat1 = context.getBean("catBean", Cat.class);
        cat1.say();

        context.close();
    }
}