package com.practice;
import java.util.*;
public class Main {
public static void main(String [] args)
{
	System.out.println("Enter 1 for membership and 2 for payback");
	Scanner sc =new Scanner(System.in);
	int choice=sc.nextInt();
	if (choice==1)
	{
		MembershipCard ob =new MembershipCard("rahul","123456789","29-11-2000",5);
		System.out.println(ob.getRating());
		System.out.println(ob.getHolderName());
		System.out.println(ob.getCardNumber());
		System.out.println(ob.getExpiryDate());
	}
	else if(choice==2)
	{
		PaybackCard ob=new PaybackCard("rahul","123456789","29-11-2000",50,60000.00);
		System.out.println(ob.getHolderName());
		System.out.println(ob.getCardNumber());
		System.out.println(ob.getExpiryDate());
		System.out.println(ob.getPointsEarned());
		System.out.println(ob.getTotalAmount());
		
	}
}
}
