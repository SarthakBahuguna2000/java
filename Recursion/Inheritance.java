package com.recursion;

class Person
{
	String pname,address;
	int age;
	public Person()
	{
		System.out.println("Person constructor");
	}
	public void display()
	{
		System.out.println("Person class");
}
}
	 class Employeee extends Person
	   {
		int eid,salary;
		public  final String company="Bhavna corp";
		public Employeee()
		{
		System.out.println("Employee constructor");
		}
		public void display()
		{
			System.out.println("employee class");
	}
	   }
	   
	
	class Student extends Employeee
	{
		public Student()
		{
		System.out.println("Student constructor");
		}
		public void display()
		{
			System.out.println("Student class");
	}
}
	public class Inheritance
	{
		public static void main(String args[])
		{
			Student ob=new Student();
			ob.display();
				
		}
	}
