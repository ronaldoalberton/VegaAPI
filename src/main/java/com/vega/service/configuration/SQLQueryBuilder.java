/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.configuration;

import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.ResultTransformer;
import java.lang.reflect.*;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.DateType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

/**
 *
 * @author Ronaldo
 */
public class SQLQueryBuilder {

    public static <T> Object buildQuery(Class<T> classe, String sql) {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        ResultTransformer resultTransformer = new AliasToBeanResultTransformer(classe);

        Field[] fields = classe.getDeclaredFields();
        SQLQuery sqlQuery = session.createSQLQuery(sql);

        for (Field field : fields) {
            if (field.getType().getSimpleName().equals("Integer")) {
                sqlQuery.addScalar(field.getName(), new IntegerType());
            } else if (field.getType().getSimpleName().equals("GregorianCalendar")) {
                sqlQuery.addScalar(field.getName(), new DateType());
            } else if (field.getType().getSimpleName().equals("BigDecimal")) {
                sqlQuery.addScalar(field.getName(), new BigDecimalType());
            } else if (field.getType().getSimpleName().equals("String")) {
                sqlQuery.addScalar(field.getName(), new StringType());
            }
        }
        
        Object object = sqlQuery.setResultTransformer(resultTransformer).list().get(0);
        
        session.getTransaction().commit();

        return object;

    }

}
