package com.bhavna.assessments;
import java.sql.*;
public class UpdateJdbc {
	private static final String UPDATE_USERS_SQL = "update Company set turnOver = 2329022 where company_Id = 1005;";
	public void updateRecord() throws SQLException {
		System.out.println(UPDATE_USERS_SQL);
      
        try (Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/combhavna","root","Bhavna@123");  
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
           

            preparedStatement.executeUpdate();
        } catch (SQLException e) {

        	e.printStackTrace();
        }

	}
	public static void main (String[]args) throws ClassNotFoundException, SQLException 
    {
		 UpdateJdbc updateStatementExample = new UpdateJdbc();
	        updateStatementExample.updateRecord();
       
    } 
}
