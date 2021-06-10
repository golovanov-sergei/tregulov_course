package com.tregulov.spring.introduction;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog created!");
    }

    @Override
    public void say(){
        System.out.println("Dog say");
    }
}
