package com.tregulov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat cat1 = context.getBean("myPet", Cat.class);
        Cat cat2 = context.getBean( "myPet",Cat.class);
//        System.out.println(cat1.equals(cat2));
//        System.out.println(cat1);
//        System.out.println(cat2);
        cat1.setName("catName1");
        cat2.setName("catName2");
        System.out.println(cat1.getName());
        System.out.println(cat2.getName());

        context.close();
    }
}
