package com.bhavna.service;

import java.sql.SQLException;

import com.bhavna.dao.DeleteFromDatabase;
import com.bhavna.dao.JdbcConnector;
import com.bhavna.dao.UpdateDatabase;

public class Tester {
	public static void main(String[] args) throws SQLException {
		JdbcConnector conn = new JdbcConnector();
		conn.Insert();
		DeleteFromDatabase deleteStatementExample = new DeleteFromDatabase();
		deleteStatementExample.deleteRecord();
		UpdateDatabase updateStatement = new UpdateDatabase();
		 updateStatement.updateRecords();
		updateStatement.viewReferralData();
	}
}
