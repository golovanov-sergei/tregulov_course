package com.tregulov.spring.introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person created!");
        this.pet = pet;
    }
    public void callPet(){
        System.out.println("Pet calling");
        pet.say();
    }
}
