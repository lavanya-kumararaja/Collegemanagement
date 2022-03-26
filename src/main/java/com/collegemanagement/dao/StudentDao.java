package com.collegemanagement.dao;

import com.collegemanagement.exception.DBException;
import com.collegemanagement.model.Student;

public interface StudentDao {

	public void register(Student student) throws DBException;
}
