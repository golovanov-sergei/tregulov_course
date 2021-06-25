package com.tregulov.spring.hibernate_many_to_many;

import com.tregulov.spring.hibernate_many_to_many.entity.Child;
import com.tregulov.spring.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Section section1 = new Section("Basketball");
            Child child = new Child("IMP", 15);
            Child child2 = new Child("IMP2", 10);
            Child child3 = new Child("IMP3", 11);
            section1.addChildToSection(child);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.persist(section1);

            session.getTransaction().commit();
            System.out.println("--------Done!--------");

//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Golf");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Dances");
//
//            Child child = new Child("Petya", 10);
//
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//            child.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child);
//
//            session.getTransaction().commit();
//            System.out.println("--------Done!--------");

//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//            Section section = session.get(Section.class,1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("--------Done!--------");
        } finally {
            session.close();
            factory.close();
        }
    }
}
