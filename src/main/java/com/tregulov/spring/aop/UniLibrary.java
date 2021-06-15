package com.tregulov.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
//    @Override
    public void getBook(Book book) {
        System.out.println("Выдаем книгу UniLibrary - "+book.getName());
    }
    protected String returnBook(){
        System.out.println("Принимаем книгу UniLibrary");
        return "Ok";
    }
    public void getMagazine() {
        System.out.println("Выдаем журнал UniLibrary");
    }
}
