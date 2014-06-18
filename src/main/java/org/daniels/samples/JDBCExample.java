package org.daniels.samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] argv) {

		System.out
				.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		final String user = "root";
		final String password = "wodna33";
		final String url = "jdbc:mysql://10.22.11.20:3306/test";
		
		System.out.println("user is: " + user);
		System.out.println("password is: " + password);
		System.out.println("url is: " + url);
		
		try {
			connection = DriverManager
					.getConnection(url, user, password);

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}
}