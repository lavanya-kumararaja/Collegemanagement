package com.collegemanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.collegemanagement.exception.DBException;
import com.collegemanagement.model.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void register(Student student) throws DBException {
		Connection con = ConnectionUtil.getDbConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement("INSERT INTO student_table(name,email,password,mobile) values (?,?,?,?)");
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getEmail());
			pstmt.setString(3, student.getPassword());
			pstmt.setLong(4, student.getMobile());
			int rows = pstmt.executeUpdate();
			System.out.println("Number of rows affected " + rows);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e.getMessage(), e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
