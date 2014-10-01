package com.simpleprogrammer;

import org.hibernate.Session;

import java.util.Date;

/**
 * Created by lenovo on 01/10/2014.
 */

public class Program {
    public static void main(String[] args) {

        Session session = HibernateUtilities.getSessionFactory().openSession();
        session.beginTransaction();
        User user3 = new User();
        user3.setName("Joaria Hossain");
        user3.getHistories().add(new UserHistory(new Date(), "Name Joaria is added"));
        user3.getProtinData().setTotal(20);
        user3.getHistories().add(new UserHistory(new Date(), "Goal is set"));
        user3.getProtinData().setGoal(250);
        session.save(user3);
        session.getTransaction().commit();

        session.beginTransaction();

        User user2 = (User)session.get(User.class, 1);

        System.out.println("Name : " +user2.getName());

        for (UserHistory history : user2.getHistories())
        {
            System.out.println(history.getEntry() + " "+history.getEntryTime().toString());
        }

        user2.getProtinData().setTotal(user2.getProtinData().getTotal()+50);

        session.getTransaction().commit();
        session.close();
        HibernateUtilities.getSessionFactory().close();
       System.out.println("Hello World");
    }
}
