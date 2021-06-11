package com.tregulov.spring.introduction;

public class Cat implements Pet{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat() {
        System.out.println("Cat created!");
    }

    @Override
    public void say() {
        System.out.println("Cat say");
    }
}
