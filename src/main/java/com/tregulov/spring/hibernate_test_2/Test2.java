package com.tregulov.spring.hibernate_test_2;

import com.tregulov.spring.hibernate_test_2.entity.Detail;
import com.tregulov.spring.hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Kolya","Ivanov","HR",800);
//            Detail detail = new Detail("NY","+79780000003","kolya@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            session = factory.getCurrentSession();



            session.beginTransaction();
            Detail detail = session.get(Detail.class,1);
            System.out.println(detail.getEmployee());
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
