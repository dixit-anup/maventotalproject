package com.learn.hibernate.cacheusing.querycache;

import com.learn.hibernate.sql.joins_sql.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import org.hibernate.Query;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 18.08.12
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class TestQueryCache {
    public static void main(String[] args){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Person person where person.id = 3");
        query.setCacheable(true);
        List personList = query.list();


        Session session2 = sessionFactory.openSession();
        Query query2 = session.createQuery("from Person person where person.id = 3");
        query2.setCacheable(true);
        List personList2 = query2.list();
        session.beginTransaction();
        session2.beginTransaction();
        Person person = (Person) session.get(Person.class, 3L);
        person.setFirstName("test");
        Person person2 = (Person) session2.get(Person.class, 3L);
        System.out.println(person.getFirstName());
        System.out.println(person2.getFirstName());
//        session.save(user2);
        session.getTransaction().commit();
    }
}
