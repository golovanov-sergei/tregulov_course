package com.tregulov.spring.introduction;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat created!");
    }

    @Override
    public void say() {
        System.out.println("Cat say");
    }
}
