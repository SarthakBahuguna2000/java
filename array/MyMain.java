package com.practice;
import java.util.*;
public class MyMain {
public static void main(String [] args)
{
	 long runs;
	 String bowler;
	 String batsman;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for last names of the bowler and batsman of that particular delivery or 2 for runs cored in that delivery");
	int choice=sc.nextInt();
	if (choice==1)
	{
		System.out.println("Last bowler name");
		bowler=sc.next();
		System.out.println("Last batsman name");
		 batsman=sc.next();
		 Delivery ob =new Delivery();
		 ob.displayDeliveryDetails(bowler,batsman);
		
		
	}
	else if(choice==2)
	{
		System.out.println("Runs scored in last delivery");
		runs=sc.nextLong();
		Delivery ob =new Delivery();
		 ob.displayDeliveryDetails(runs);
		
	}
	 
	 
	}
}
