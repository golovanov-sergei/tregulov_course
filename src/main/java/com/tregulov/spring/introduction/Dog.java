package com.tregulov.spring.introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
@Scope("prototype")

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog created!");
    }

    public void init(){
        System.out.println("Dog init method");
    }

    public void destroy(){
        System.out.println("Dog destroy method");
    }
    @Override
    public void say(){
        System.out.println("Dog say");
    }
}
