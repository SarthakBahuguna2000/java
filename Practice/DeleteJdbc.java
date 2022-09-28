package com.bhavna.assessments;
import java.sql.*;
import java.util.*;
public class DeleteJdbc {
	 private static final String DELETE_USERS_SQL = "delete from Company where company_id = 1;";
	public void deleteRecord() throws SQLException {
		
        System.out.println(DELETE_USERS_SQL);

        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/combhavna","root","Bhavna@123");

           
            Statement statement = connection.createStatement();) {

          
            int result = statement.executeUpdate(DELETE_USERS_SQL);
            System.out.println("Number of records affected :: " + result);
        } catch (SQLException e) {

           
        	e.printStackTrace();
        }

      
    }
	public static void main (String[]args) throws ClassNotFoundException, SQLException 
    {
		 DeleteJdbc deleteStatementExample = new DeleteJdbc();
	        deleteStatementExample.deleteRecord();
	        
    }
}
