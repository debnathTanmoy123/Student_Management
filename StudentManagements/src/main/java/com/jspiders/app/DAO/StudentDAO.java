package com.jspiders.app.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.app.DTO.StudentDTO;

@Repository
public class StudentDAO {
	@Autowired
SessionFactory factory;
	
	public int saveStudent(StudentDTO studentDTO)
	{
		Session session=factory.openSession();
		session.beginTransaction();
		int id=(int)session.save(studentDTO);
		session.getTransaction().commit();
		session.close();
		return id;
		
	}
	public void deleteStudent(StudentDTO studentDTO)
	{
		Session session=factory.openSession();
		session.beginTransaction();
		session.delete(studentDTO);
		session.getTransaction().commit();
		session.close();
		
	}
}
