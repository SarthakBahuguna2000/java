package com.recursion;

public class Demo {
	static int age;
	  static String name;
	  public static final String company="Bhavna Corp";
	  static void show(){
	      System.out.println("Age is: "+age);
	      System.out.println("Name is: "+name);
	      System.out.println("Company is: "+company);
	  }
	  
	  public static void main(String args[]) 
	  {
		  age = 20;
		  name = "Charlie";
	      show();
	  }
}
