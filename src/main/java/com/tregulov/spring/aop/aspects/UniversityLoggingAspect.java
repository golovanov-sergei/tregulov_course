package com.tregulov.spring.aop.aspects;

import com.tregulov.spring.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents(..))")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логгируем получение" +
//                "списка студентов перед методом getStudents");
//    }
//    @AfterReturning(pointcut = "execution(* getStudents(..))", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSirname = firstStudent.getNameSurname();
//        nameSirname = "Mr. "+nameSirname;
//        firstStudent.setNameSurname(nameSirname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логгируем получение " +
//                "списка студентов после метода getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents(..))", throwing = "exception")
//    public  void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс " +
//                "исключения");
//        System.out.println("Логгируем исключение "+exception);
//    }
    @After("execution(* getStudents(..))")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем after final");
    }
}
