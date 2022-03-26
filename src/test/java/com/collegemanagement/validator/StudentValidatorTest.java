package com.collegemanagement.validator;

import com.collegemanagement.model.Student;

public class StudentValidatorTest {

	public static void main(String[] args) throws Exception {
		
		Student student=new Student();
	
		student.setName("Lavanya");
		student.setEmail("klavanya1997@gmail.com");
		student.setMobile(8778804219l);
		student.setPassword("Lalu@123");
		StudentValidator.validateStudent(student);
		System.out.println(student);

	}

}
