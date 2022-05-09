package com.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Student;

public class StudentDAO {
	// insert , delete, udate,select all, select by id

	// we make a separte method for connection with database

	public static Session createSessoion() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}

	// for Update Record in database
	public static void updatedata(Student s) {
		Session session = StudentDAO.createSessoion();
		session.beginTransaction();
		session.update(s);
		session.getTransaction().commit();
		session.close();
	}

	// fetch recored base on id
	public static Student getStudentByID(int id) {
		Session session = StudentDAO.createSessoion();
		session.beginTransaction();
		Student s = session.get(Student.class, id);
		return s;
	}

	// delete Opertion

	public static void deleteData(int id) {
		Session session = StudentDAO.createSessoion();
		session.beginTransaction();
		// get is the method of org.hibernate.Session interface
		// single row of data retrive from Student bean class--> database
		// get(entity type,id)
		// entity type --> its your bean class
		// id --> is the record which you want to find from the database

		Student s = session.get(Student.class, id);
		session.delete(s);
		session.getTransaction().commit();
		session.close();
	}

	// search all data from database

	public static List<Student> getAllData() {
		Session session = StudentDAO.createSessoion();
		List<Student> list = session.createQuery("from Student").list();
		return list;
	}

	// insert data
	public static void insertData(Student s) {

		Session session = StudentDAO.createSessoion();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();

	}

}
