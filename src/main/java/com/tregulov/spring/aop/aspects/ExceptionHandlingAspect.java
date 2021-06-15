package com.tregulov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class ExceptionHandlingAspect {
    @Before("com.tregulov.spring.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: ловим/обрабатываем" +
                "исключения при попытке получить кингу/журнал");

    }
}
