package com.tregulov.spring.aop.aspects;

import com.tregulov.spring.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents(..))")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: логгируем получение" +
                "списка студентов перед методом getStudents");
    }
    @AfterReturning(pointcut = "execution(* getStudents(..))", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String nameSirname = firstStudent.getNameSurname();
        nameSirname = "Mr. "+nameSirname;
        firstStudent.setNameSurname(nameSirname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade+1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: логгируем получение " +
                "списка студентов после метода getStudents");
    }
}
