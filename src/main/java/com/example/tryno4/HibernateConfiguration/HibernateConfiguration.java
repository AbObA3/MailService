package com.example.tryno4.HibernateConfiguration;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (HibernateException ex) {
            throw new ExceptionInInitializerError(String.valueOf(ex));
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
}

//    final Session session = getSession();
//        try {
//                System.out.println("querying all the managed entities...");
//final Metamodel metamodel = session.getSessionFactory().getMetamodel();
//        for (EntityType<?> entityType : metamodel.getEntities()) {
//final String entityName = entityType.getName();
//final Query query = session.createQuery("from " + entityName);
//        System.out.println("executing: " + query.getQueryString());
//        for (Object o : query.list()) {
//        System.out.println("  " + o);
//        }
//        }
//        } finally {
//        session.close();
//        }