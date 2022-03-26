package com.collegemanagement.dao;

import com.collegemanagement.exception.DBException;
import com.collegemanagement.model.Student;

public class StudentDaoTest {

	public static void main(String[] args) throws DBException {
	
		Student student=new Student();
		student.setName("Lavanya");
		student.setEmail("lalulavanya844@gmail.com");
		student.setMobile(8778804219l);
		student.setPassword("Lalu@123");
		StudentDao studentDao=new StudentDaoImpl();
		studentDao.register(student);
		
	}

}
