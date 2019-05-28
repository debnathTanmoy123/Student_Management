package com.jspiders.app.DAO;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.btm.Jspider.HibernateUtil;
import com.jspiders.app.dto.StudentDto;

@Repository
public class StudentDAO {
	@Autowired
	SessionFactory factory;

	public Serializable saveStudent(StudentDto studentDto) {
		Long id = null;
		Transaction transaction = null;
		try (Session session = factory.openSession())           // --------------Closable------------
		{
			transaction = session.getTransaction();
			transaction.begin();
			session.save(studentDto);
			session.getTransaction().commit();

		} catch (Exception e) {

			transaction.rollback();
		}

		return id;

	}

	
}
