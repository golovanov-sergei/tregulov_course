package com.tregulov.spring.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")

public class Person {
/*
    @Autowired
    @Qualifier("catBean")
*/
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        System.out.println("Clear person created!");
    }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Person set pet");
        this.pet = pet;
    }


    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person with pet created!");
        this.pet = pet;
    }


    public void callPet() {
        System.out.println("Pet calling");
        pet.say();
    }
}
