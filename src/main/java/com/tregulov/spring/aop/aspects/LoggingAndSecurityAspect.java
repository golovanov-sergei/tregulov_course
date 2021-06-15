package com.tregulov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*(..))")
    private void allGetMethods(){}

//    @Before("execution(* get*(..))")
    @Before("allGetMethods()")
//    @Before("execution(public void com.tregulov.spring.aop.UniLibrary.getBook())")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: попытка выдать книгу/журнал");
    }

//    @Before("execution(* get*(..))")
    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на выдачу кинги/журнала");

    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка принять книгу.");
    }
}
