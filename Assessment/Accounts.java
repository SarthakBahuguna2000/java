package com.bhavna.assessment;

import java.util.Scanner;

public class Accounts extends AshaSoftware {
	
  public void registration()
  {
	  double lon,lat;
	  Scanner input=new Scanner(System.in);
	 
	 System.out.println("Register");
	  System.out.println("Username: ");
	    String user = input.next();
	    System.out.println("Password: ");
	    String pass = input.next();
	    System.out.println("Confirm Password: ");
	    String conf = input.next();
	    System.out.println("Customer age ");
	    int age = input.nextInt();
	    System.out.println("Customer address ");
	    String address = input.next();
	    System.out.println(conf);
	    System.out.println(pass);
	   if(conf.equals(pass))
	    {
		   System.out.println("Successfully registered");
	   	
	    }
	   else
	  {
		   System.out.println("Incorrect password");
	  }
		System.out.println("Login");
		System.out.println("Enter the username");
		String user1 = input.next();
		System.out.println("Password: ");
	    String pass1 = input.next();
	    if (user!=user1 && pass !=pass1)
	    {
	    	System.out.println("enter longitude and latitude value");
	    	lon=input.nextDouble();
	    	lat=input.nextDouble();
	    }
  }
  }


