/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.configuration;

/**
 *
 * @author ronaldo.alberton
 */
import com.vega.service.nfse.model.MovNFSe;
import com.vega.service.nfse.model.MovNotaFiscal;
import com.vega.service.nfse.model.NotaFiscalItensView;
import com.vega.service.nfse.model.NotaFiscalView;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {

            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

            configuration.addAnnotatedClass(NotaFiscalView.class);
            configuration.addAnnotatedClass(NotaFiscalItensView.class);
            configuration.addAnnotatedClass(MovNFSe.class);
            configuration.addAnnotatedClass(MovNotaFiscal.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            return configuration.buildSessionFactory(serviceRegistry);

        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Object getSingleClass(String sql){
        getSessionFactory().getCurrentSession().beginTransaction();
        Object object = getSessionFactory().getCurrentSession().createQuery(sql).uniqueResult();
        getSessionFactory().getCurrentSession().getTransaction().commit();
        return object;
    }

    public static List<Object> getListClass(String sql){
        getSessionFactory().getCurrentSession().beginTransaction();
        List<Object> object = getSessionFactory().getCurrentSession().createQuery(sql).list();
        getSessionFactory().getCurrentSession().getTransaction().commit();
        return object;
    }


    public static void saveOrUpdate(List<Object> objects){
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        for ( Object object : objects ) {
            HibernateUtil.getSessionFactory().getCurrentSession().saveOrUpdate(object);
        }
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
    }

    public static void saveOrUpdate(Object object){
        List<Object> objects = new ArrayList<Object>();
        objects.add(object);
        saveOrUpdate(objects);
    }
}
