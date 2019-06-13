package com.artiushenko.hibernateTest;

import com.artiushenko.hibernateTest.bl.HibernateUtil;
import com.artiushenko.hibernateTest.entity.Town;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Town town = new Town();
        town.setId(7);
        town.setTown("newTown2");

        session.save(town);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
