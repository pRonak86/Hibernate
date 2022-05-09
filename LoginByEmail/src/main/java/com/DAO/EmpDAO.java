package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Employee;

public class EmpDAO {

	public static Session createSession() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}

	public static Employee getDataByEmail(String email)
	{
		Session session=EmpDAO.createSession();
		session.beginTransaction();
		Query query=session.createQuery("from Employee where eemail=:n");
		query.setParameter("n", email);
		Employee e=(Employee) query.getSingleResult();
		return e;
		
	}
	
	
	
	
	
	
	
	
	
	
	// Insertion code
	public static void insertdata(Employee e) {
		Session session = EmpDAO.createSession();
		session.beginTransaction();
		session.persist(e);
		session.getTransaction().commit();
		session.close();
	}
	
	

}
