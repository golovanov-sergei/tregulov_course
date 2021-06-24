package com.tregulov.spring.hibernate_test;

import com.tregulov.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Oleg", "Ivanov", "HR", 100);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit(); // закрывает сессию

            int myId = emp.getId();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit(); //Закрывает сессию
            System.out.println(employee);


            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
}
