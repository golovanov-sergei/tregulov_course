package com.tregulov.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Shock Imp", 4, 7.7);
        Student st2 = new Student("Student 2", 5, 2.7);
        Student st3 = new Student("Student 3", 3, 6.7);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Работает getStudents()");
        System.out.println(students);
        return students;
    }



    ;
}
