package com.tregulov.spring.hibernate_test;

import com.tregulov.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession(); //Открывает сессию
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);


            session.createQuery("delete Employee  " +
                    "where name='John'").executeUpdate();

            session.getTransaction().commit(); //Закрывает сессию
            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
}