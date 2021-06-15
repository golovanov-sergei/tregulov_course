package com.tregulov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);

        library.getBook();
        library.getMagazine();
//        library.returnBook();
//        library.returnMagazine();
//        library.addBook();
//        library.addMagazine();

        context.close();
    }
}
