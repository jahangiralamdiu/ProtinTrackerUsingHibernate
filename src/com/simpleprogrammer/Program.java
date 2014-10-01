package com.simpleprogrammer;

import org.hibernate.Session;

/**
 * Created by lenovo on 01/10/2014.
 */

public class Program {
    public static void main(String[] args) {

        Session session = HibernateUtilities.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User();
        user.setName("Jahangir");
        user.setTotal(20);
        user.setGoal(250);
        session.save(user);
        session.getTransaction().commit();
        session.close();
        HibernateUtilities.getSessionFactory().close();
       System.out.println("Hello World");
    }
}
