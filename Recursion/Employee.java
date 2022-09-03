package com.recursion;
import java.util.*;
public class Employee {
private int empid;
private String name;
private double per;
private static String company="Bhavna corp";
private Employee(int empid,String name,double per)
{
	this.empid=empid;
	this.name=name;
	this.per=per;
}
public void show()
{
	System.out.println(empid);
	System.out.println(name);
	System.out.println(per);
}
public static void display()
{
	System.out.println("Display working");
}
public static Employee createemployee()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter empid,name,percentage");
	int empid=sc.nextInt();
	String name=sc.next();
	double per=sc.nextDouble();
	Employee e=new Employee(empid,name,per);
	return e;
	}
public static void increment(Employee emp)
{
	emp.per=emp.per+20;
}
public static void main(String[]args)
{
	Employee E1=Employee.createemployee();
	E1.show();
	Employee E2=Employee.createemployee();
	E2.show();
	Employee.increment(E1);
	
}
}
