package com.tregulov.spring.aop.aspects;

import com.tregulov.spring.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class LoggingAspect {
/*

    @Pointcut("execution(* com.tregulov.spring.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* com.tregulov.spring.aop.UniLibrary.returnMagazine(..))")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }


    @Before("allMethodsFromUniLibrary()")
    public void beforeAllMethodsFromUniLibraryAdvice() {
        System.out.println("beforeallMethodsFromUniLibraryAdvice: writing log#1");
    }

    @Before("returnMagazineFromUniLibrary()")
    public void beforeReturnMagazineFromUniLibraryAdvice() {
        System.out.println("beforereturnMagazineFromUniLibraryAdvice: writing log#2");
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineFromUniLibraryAdvice() {
        System.out.println("beforeallMethodsExceptReturnMagazineFromUniLibraryAdvice: writing log#3");
    }
*/

  /*  @Pointcut("execution(* com.tregulov.spring.aop.UniLibrary.get*(..))")
    private void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* com.tregulov.spring.aop.UniLibrary.return*(..))")
    private void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary(){
    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log#1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing log#2");
    }
    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: writing log#3");
    }*/


//    @Before("execution(* get*(..))")
    @Before("com.tregulov.spring.aop.aspects.MyPointcuts.allAddMethods()")
//    @Before("execution(public void com.tregulov.spring.aop.UniLibrary.getBook())")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("--------------------------------------------");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = "+methodSignature);
        System.out.println("methodSignature.getMethod() = "+methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "+methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - "+myBook.getName()+", автор - "+
                            myBook.getAuthor()+" год издания - "+myBook.getYearOfPublication());
                } else if (obj instanceof String){
                    System.out.println("Книгу добваляет: "+obj);
                }
            }
        }
        System.out.println("--------------------------------------------");

        System.out.println("beforeGetLoggingAdvice: попытка выдать книгу/журнал");
        System.out.println("--------------------------------------------");

    }



//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка принять книгу.");
//    }
}
