package com.simpleprogrammer;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by lenovo on 01/10/2014.
 */
public class HibernateUtilities {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration().configure("/hibernet.cfg.xml");
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
                    applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());

        } catch (HibernateException hx)
        {
            System.out.println("Problem in creating session Factory" + hx);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
