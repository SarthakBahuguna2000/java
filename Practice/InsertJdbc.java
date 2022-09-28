package com.bhavna.assessments;
import java.sql.*;
public class InsertJdbc {
	 public static void main(String[] args) 
	    {
		 try {
	     Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/combhavna","root","Bhavna@123");
	     Statement st = con.createStatement();
	        int c = st.executeUpdate("insert into Company values(1005, 300000,'delhi', 2021-05-02)");
	        System.out.println( "account stored successfully");
	         c = st.executeUpdate("insert into account values(1006, 40000,'bhuvneshwar', 2020-06-01)");
	        System.out.println("stored successfully");
	        st.close();
	        con.close();
		 }
		 catch(Exception e) {
	            e.printStackTrace();
	    }
	}
}

