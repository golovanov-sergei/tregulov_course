package com.tregulov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat cat1 = context.getBean("myPet", Cat.class);
        cat1.say();

        context.close();
    }
}
