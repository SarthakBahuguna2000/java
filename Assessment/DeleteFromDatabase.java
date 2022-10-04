package com.bhavna.dao;

import java.sql.*;

public class DeleteFromDatabase {

	String sql = "DELETE FROM Referral WHERE referralFirstname=?";

	public void deleteRecord() throws SQLException {

		System.out.println(sql);

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dphoneCorporation", "root",
					"Bhavna@123");

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "bill");

			int rowsDeleted = statement.executeUpdate();

			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/**
	 * String dbURL = "jdbc:mysql://localhost:3306/dphoneCorporation"; String
	 * username = "root"; String password = "Bhavna@123";{
	 * 
	 * try { Connection conn = DriverManager.getConnection(dbURL, username,
	 * password);
	 * 
	 * PreparedStatement statement = conn.prepareStatement(sql);
	 * statement.setString(1, "bill");
	 * 
	 * 
	 * int rowsDeleted = statement.executeUpdate(); if (rowsDeleted > 0) {
	 * System.out.println("A user was deleted successfully!"); } } catch
	 * (SQLException ex) { ex.printStackTrace(); } }
	 **/
}