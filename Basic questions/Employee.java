package com.Threenumber;

 class Info {
  int eid;
  long salary;
  String name;
  static int count=0;
  static String company="Bhavnacorp";
  public Info(int eid, long salary,String name)
  {
	  this.eid=eid;
	  this.salary=salary;
	  this.name=name;
	  count+=1;
	  if(salary>50000)
	  {
		  System.out.println("eid=" +eid + "employee name=" +name + "employee salary=" +salary + "comapny name=" +company );
	  }
  }
}
public class Employee
{
	public static void main(String []args)
	{
		Info ob=new Info(101,80000,"Clark joshi");
		Info ob1=new Info(101,10000,"Rohit");
		Info ob2=new Info(101,55000,"Amit");
		Info ob3=new Info(101,30000,"Abhishek");
		System.out.println(Info.count);
		
	}
}

