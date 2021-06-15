package com.tregulov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void get*())")
//    @Before("execution(public void com.tregulov.spring.aop.UniLibrary.getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка выдать книгу.");
    }
    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: попытка принять книгу.");
    }
}
