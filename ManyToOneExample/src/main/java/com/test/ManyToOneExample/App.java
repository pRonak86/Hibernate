package com.test.ManyToOneExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Address a=new Address();
        a.setCity("Bhavnagar");
        
        Address a1=new Address();
        a1.setCity("Baroda");
        
        Student s=new Student();
        s.setStu_name("Kaushik");
        s.setAddress(a);
        
        Student s1=new Student();
        s1.setStu_name("Milan");
        s1.setAddress(a);
        
        
        Student s2=new Student();
        s2.setStu_name("Yatin");
        s2.setAddress(a1);
        
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(s);
        session.save(s1);
        session.save(s2);
        session.getTransaction().commit();
        
        session.close();
        sessionFactory.close();
        
        
    }
}
