package com.bhavna.dao;

import java.sql.*;

public class JdbcConnector {
	String sql = "INSERT INTO Referral (referalId, referralFirstname, referrallastname,mobile,email,userId,dateofreferral) VALUES (?, ?, ?, ? , ? , ? , ?)";
	String dbURL = "jdbc:mysql://localhost:3306/dphonecorporation";
	String username = "root";
	String password = "Bhavna@123";

	public void Insert() throws SQLException {
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection conn = DriverManager.getConnection(dbURL, username, password);

			if (conn != null) {
				System.out.println("Connected");
			}

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 1234);
			statement.setString(2, "bill");
			statement.setString(3, "gates");

			statement.setInt(4, 7658943);
			statement.setString(5, "bg@123");

			statement.setInt(6, 101);
			statement.setString(7, "2022-06-03");

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
