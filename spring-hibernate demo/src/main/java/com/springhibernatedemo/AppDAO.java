package com.springhibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);
		System.out.println("student data saved");
	}

}
