package com.tregulov.spring.hibernate_one_to_many_bi;

import com.tregulov.spring.hibernate_one_to_many_bi.entity.Department;
import com.tregulov.spring.hibernate_one_to_many_bi.entity.Employee;
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
/*
            session = factory.getCurrentSession();
            Department dep = new Department("IT", 500,700);
            Employee emp1 = new Employee("Shock","Imp", 700);
            Employee emp2 = new Employee("Elena","Smirnova", 500);
            Employee emp3 = new Employee("W3","Sm3", 550);
            Employee emp4 = new Employee("W4","Sm4", 600);
            dep.addEplyeeToDepartment(emp1);
            dep.addEplyeeToDepartment(emp2);
            dep.addEplyeeToDepartment(emp3);
            dep.addEplyeeToDepartment(emp4);

            session.beginTransaction();
            session.save(dep);


            session.getTransaction().commit();
            System.out.println("Done!");
*/
//************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class,3);
            System.out.println("Print department");
            System.out.println(department);
            System.out.println("Print employees");
            System.out.println(department.getEmps());

//            Employee employee = session.get(Employee.class,3);
//            session.delete(employee);


            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
