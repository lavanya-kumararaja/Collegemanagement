package com.collegemanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getDbConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_management", "root", "root@12345");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;

	}
}
