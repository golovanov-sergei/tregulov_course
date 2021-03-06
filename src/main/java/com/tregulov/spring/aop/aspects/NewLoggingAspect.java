package com.tregulov.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewLoggingAspect {
    @Around("execution(public String returnBook(..))")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

//        long begin = System.currentTimeMillis();
        Object targetMethodRusult = null;
        try {
            targetMethodRusult = proceedingJoinPoint.proceed();
        } catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice exception caught " + e);
//            targetMethodRusult = "Name unknown";
            throw e;
        }
//        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
//        System.out.println(end-begin);
        return targetMethodRusult;
    }
}
