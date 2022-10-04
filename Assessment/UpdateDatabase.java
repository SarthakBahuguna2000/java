package com.bhavna.dao;

import java.sql.*;

public class UpdateDatabase {
	String sql = "UPDATE Referral SET email=? WHERE referralFirstname=?";
	String dbURL = "jdbc:mysql://localhost:3306/dphoneCorporation";
	String username = "root";
	String password = "Bhavna@123";

	public void updateRecords() throws SQLException {

		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "bi@123");

			statement.setString(2, "bill");

			int rowsUpdated = statement.executeUpdate();

			System.out.println("An existing user was updated successfully!");

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void viewReferralData() throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dphoneCorporation", "root",
				"Bhavna@123");
		String query = "select * from referral";
		Statement stmnt = connection.createStatement();
		ResultSet res = stmnt.executeQuery(query);
		while (res.next()) {
			int id = res.getInt("referalId");
			String name = res.getString("referralFirstname");
			String phoneNo = res.getString("mobile");
			String email = res.getString("email");
			String date = res.getString("dateofreferral");
			System.out.println(id + "\t" + name + "\t" + phoneNo + "\t" + email + "\t" + date);
		}
		res.close();
	}
}
