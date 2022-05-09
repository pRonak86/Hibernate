package com.test.OneToOneExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Details d = new Details();
		d.setContact(985622);
		d.setCity("Anand");

		Student s = new Student();
		
		s.setName("Yatin");
		s.setDetails(d);

		Details d1 = new Details();
		d1.setContact(885555);
		d1.setCity("Baroda");

		Student s1 = new Student();
		s1.setName("Tripathi");
		s1.setDetails(d1);

		Details d2 = new Details();
		d2.setContact(885555);
		d2.setCity("Baroda");

		Student s2 = new Student();
		s2.setName("Tripathi");
		s2.setDetails(d2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(s);
		session.save(s1);
		session.save(s2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
