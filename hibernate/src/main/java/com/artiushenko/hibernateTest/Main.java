package com.artiushenko.hibernateTest;

import com.artiushenko.hibernateTest.entity.Town;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Town town = new Town();
        town.setTown("newTown2");

        session.save(town);
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
