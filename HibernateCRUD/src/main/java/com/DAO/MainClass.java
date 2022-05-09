package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Student;

public class MainClass {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query q=session.createQuery("from Student");
		q.setFirstResult(3);
		q.setMaxResults(1);
		List<Student> l=q.list();
		for (Student s : l) {
			
			System.out.println(s.getId()+" "+s.getName()+" "+s.getContact()+" "+s.getEmail());
		}
		session.getTransaction().commit();
		session.close();
	}

}
