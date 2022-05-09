package com.test.OneToManyExam;

import java.util.ArrayList;

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
        MarkDetails m1=new MarkDetails();
        m1.setSubject("Java");
        m1.setMax_marks(100);
        m1.setObt_marks(60);
        
        MarkDetails m2=new MarkDetails();
        m2.setSubject("PHP");
        m2.setMax_marks(100);
        m2.setObt_marks(70);
        
        ArrayList<MarkDetails> arr=new ArrayList<MarkDetails>();
        arr.add(m1);
        arr.add(m2);
        
        Student s=new Student();
        s.setFname("XYZ");
        s.setContact(54545);
        s.setMarkDetails(arr);
        
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        
        
        
        
        
        
        
    }
}
