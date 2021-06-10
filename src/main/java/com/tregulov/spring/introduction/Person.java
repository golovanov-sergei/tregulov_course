package com.tregulov.spring.introduction;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Clear person created!");
    }

    public void setPet(Pet pet) {
        System.out.println("Person set pet");
        this.pet = pet;
    }

    public Person(Pet pet) {
        System.out.println("Person with pet created!");
        this.pet = pet;
    }
    public void callPet(){
        System.out.println("Pet calling");
        pet.say();
    }
}
