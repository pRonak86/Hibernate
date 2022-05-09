package com.test.ManyToManyExample;

import java.util.ArrayList;
import java.util.List;

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
       
    	Course c=new Course();
    	c.setCourse_Name("Java");
    	
    	Course c1=new Course();
    	c1.setCourse_Name("NET");
    	
    	Course c2=new Course();
    	c2.setCourse_Name("PHP");
    	
    	List<Course> ll=new ArrayList<Course>();
    	ll.add(c);
    	ll.add(c1);
    	
    	List<Course> ll1=new ArrayList<Course>();
    	ll1.add(c);
    	ll1.add(c2);
    	
    	
    	
    	Student s=new Student();
    	s.setSname("Yatin");
    	s.setCourses(ll);
    	
    	Student s1=new Student();
    	s1.setSname("Dharini");
    	s1.setCourses(ll1);
    	
    	
    	
    	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
    	Session session=sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(s);
    	session.save(s1);
    	session.getTransaction().commit();
    	session.close();
    	sessionFactory.close();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
