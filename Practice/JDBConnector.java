package com.bhavna.assessments;
import java.sql.*;
public class JDBConnector {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/combhavna","root","Bhavna@123");
            String s="insert into Company(company_Id,turnOver,address,date) values(?,?,?,?)";
            PreparedStatement pstmnt=connection.prepareStatement(s);
            pstmnt.setInt(1,1);
            pstmnt.setDouble(2,123400);
            pstmnt.setString(3,"Delhi");
            pstmnt.setString(4,"2022-09-26");
            pstmnt.executeUpdate();
            System.out.println("Data inserted");
            /*
            if(connection.isClosed()) {
                System.out.println("Connection is still closed.");
            }else {
                System.out.println("Connection created");
            }*/
        }catch(Exception e) {
            e.printStackTrace();
        }



   }
}
