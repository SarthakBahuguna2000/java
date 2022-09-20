package com.bhavna.assessment;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DPhoneCorporation  {

	public static void main(String[] args) {
	
		
		Requirements ob=new Requirements();
		ob.register();
		ob.login();
		System.out.println("1 for referal bought phone and 2 for rejected");
		Scanner scanner = new Scanner(System.in);
		int choice=scanner.nextInt();
		
		
		if (choice==1)
		{
			Referal ob1=new Referal();
			ob1.bonuspoints();
			
			ob1.setFullName("member1");
			ob1.setEmailId("123@gmail.com");
			ob1.setName("username000");
			ob1.setPhoneNo("4598796");
			ob1.setReferalcode("abc123");
			
			ob1.view();
			
			System.out.println(ob1.getFullName());
			System.out.println(ob1.getEmailId());
			System.out.println(ob1.getPhoneNo());
			
			System.out.println("do you want to change the information , press 1");
				int ans=scanner.nextInt();
				if (ans==1)
			    ob1.edit();
			
			
			
		}
		else
		{
			System.out.println("Referal not accepted");
	}
		
		
		
		
		
	
		System.out.println("third part");
		
		//Referal ref2=new Referal();
		//ref2.write(ref2);
		//public void writeToFile(String fileName) throws Exception {
		/**
			try {
			File f = new File("C:\\first day git\\referral.txt");
			FileWriter myWriter = new FileWriter("C:\\first day git\\referral.txt");
			myWriter.write("member1 , 123@gmail.com ,username000");
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
		
		StoreData ob2=new StoreData();
		try {
		
		ob2.writeToFile("referral.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	**/
}
}
