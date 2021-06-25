package com.tregulov.spring.hibernate_one_to_many_uni;

import com.tregulov.spring.hibernate_one_to_many_uni.entity.Department;
import com.tregulov.spring.hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("HR", 700,900);
//            Employee emp1 = new Employee("HR1","HR1S", 700);
//            Employee emp2 = new Employee("HR2","HR2S", 900);
//            dep.addEplyeeToDepartment(emp1);
//            dep.addEplyeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();

            session.beginTransaction();

            Department department = session.get(Department.class,2);
            session.delete(department);

            //            System.out.println(department);
//            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
