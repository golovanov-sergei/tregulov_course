package com.tregulov.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //    @Override
    public void getBook() {
        System.out.println("Выдаем книгу UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void returnBook() {
        System.out.println("Принимаем книгу UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Выдаем журнал UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Принимаем журнал UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Добавляем книгу UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал UniLibrary");
        System.out.println("--------------------------------------------");
    }
}
