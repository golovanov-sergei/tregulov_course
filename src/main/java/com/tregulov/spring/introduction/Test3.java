package com.tregulov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Cat();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
        Person person = context.getBean("myPerson",Person.class);
        person.callPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());


        context.close();
    }
}
