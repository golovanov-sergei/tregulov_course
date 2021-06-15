package com.tregulov.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //    @Override
    public void getBook() {
        System.out.println("Выдаем книгу UniLibrary");
    }

    public void returnBook() {
        System.out.println("Принимаем книгу UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Выдаем журнал UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Принимаем журнал UniLibrary");
    }

    public void addBook() {
        System.out.println("Добавляем книгу UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал UniLibrary");
    }
}
