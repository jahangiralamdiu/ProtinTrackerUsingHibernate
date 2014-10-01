package com.simpleprogrammer;

import org.hibernate.Session;

/**
 * Created by lenovo on 01/10/2014.
 */

public class Program {
    public static void main(String[] args) {

        Session session = HibernateUtilities.getSessionFactory().openSession();
        session.beginTransaction();
        User user3 = new User();
        user3.setName("Joaria Hossain");
        user3.getProtinData().setTotal(20);
        user3.getProtinData().setGoal(250);
        session.save(user3);
        session.getTransaction().commit();

//        session.beginTransaction();
//
//        User user2 = (User)session.get(User.class, 2);
//
//        System.out.println("Name : " +user2.getName());
//
//        user2.setTotal(user2.getTotal()+50);
//
//        session.getTransaction().commit();
        session.close();
        HibernateUtilities.getSessionFactory().close();
       System.out.println("Hello World");
    }
}
