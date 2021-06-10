package com.tregulov.spring.introduction;

public class Dog implements Pet{
    @Override
    public void say(){
        System.out.println("Dog say");
    }
}
