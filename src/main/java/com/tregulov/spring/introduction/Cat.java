package com.tregulov.spring.introduction;

import org.springframework.stereotype.Component;

@Component("catBean")

public class Cat implements Pet{
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void init(){
        System.out.println("Cat init method");
    }
    public void destroy(){
        System.out.println("Cat destroy method");
    }

    public Cat() {
        System.out.println("Cat created!");
    }

    @Override
    public void say() {
        System.out.println("Cat say");
    }
}
