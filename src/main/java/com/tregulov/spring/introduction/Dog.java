package com.tregulov.spring.introduction;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog created!");
    }

    @Override
    public void say(){
        System.out.println("Dog say");
    }
}
