package com.bhavna.assessment;
import java.io.File;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Referal implements java.io.Serializable {
	public String fullName;
    public String Name;
    int points=0;
    
    public String emailId;
    public String phoneNo;
    
    public String referalCode;
    
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}

	

	public void setReferalcode(String referalCode) {
		this.referalCode = referalCode;
	}

	

	public void bonuspoints()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of referrals: ");
        int n = sc.nextInt();
       
       System.out.println("Enter choice number ");
        int choice = sc.nextInt();
       
        
        if (choice==1 && choice<n ){
		points+=1000;
		
		System.out.println(" bonus points received " +points);
        
		try {
	        File file=new File("C:\\first day git\\Referral.txt");
	        FileOutputStream fout=new FileOutputStream(file, true);
	        ObjectOutputStream oos=new ObjectOutputStream(fout);
	        Referal ref=new Referal();
	        System.out.println(ref.getName());
	        System.out.println(ref.getPhoneNo());
	        System.out.println(ref.getEmailId());
	        oos.writeObject(ref);
	        System.out.println("Record added Successfully");
	        oos.close();
	        fout.close();
	    }catch(Exception e) {
	        System.out.println(e);
	    }
	}	
       
	
	if (choice==2 && choice<n ){
		Referal ob1=new Referal();
		ob1.setFullName("member2");
		ob1.setEmailId("1234@gmail.com");
		ob1.setName("username100");
		ob1.setPhoneNo("5598796");
		ob1.setReferalcode("abc124");
		points+=1000;
		
		System.out.println(" bonus points received " +points);
        
		try {
	        File file=new File("C:\\first day git\\Referral.txt");
	        FileOutputStream fout=new FileOutputStream(file, true);
	        ObjectOutputStream oos=new ObjectOutputStream(fout);
	        Referal ref=new Referal();
	        System.out.println(ref.getName());
	        System.out.println(ref.getPhoneNo());
	        System.out.println(ref.getEmailId());
	        oos.writeObject(ref);
	        System.out.println("Record added Successfully");
	        oos.close();
	        fout.close();
	    }catch(Exception e) {
	        System.out.println(e);
	    }
	}	
	System.out.println("Enter choice number ");
     choice = sc.nextInt();
	
	if (choice==3 && choice<n ){
		Referal ob1=new Referal();
		ob1.setFullName("member3");
		ob1.setEmailId("1224@gmail.com");
		ob1.setName("username200");
		ob1.setPhoneNo("6598796");
		ob1.setReferalcode("abc125");
		points+=1000;
		
		System.out.println(" bonus points received " +points);
        
		try {
	        File file=new File("C:\\first day git\\Referral.txt");
	        FileOutputStream fout=new FileOutputStream(file, true);
	        ObjectOutputStream oos=new ObjectOutputStream(fout);
	        Referal ref=new Referal();
	        System.out.println(ref.getName());
	        System.out.println(ref.getPhoneNo());
	        System.out.println(ref.getEmailId());
	        oos.writeObject(ref);
	        System.out.println("Record added Successfully");
	        oos.close();
	        fout.close();
	    }catch(Exception e) {
	        System.out.println(e);
	    }
	}	
	
	}

            
		
		
	
	public void view()
	{
		System.out.println("showing the information about referred person");
		
	}
	public void edit()
	{
		System.out.println("newName=member01" );
		System.out.println("newEmail=1234@gmail.com" );
		System.out.println("newPhone=8765426" );
	}
		
		/**
		System.out.println("1 to edit name , 2 to edit gmail ,3 to edit phone no");
		
		
		
		int choice=scanner.nextInt();
		if (choice==1)
		{
		ob1.setFullName("member01");
		}
		else if(choice==2)
		{
			ob1.setEmailId("email123.com");
		}
		else
		{
			ob1.setPhoneNo(2345678);
		}
		System.out.println("Succesfull done");
	}
	}**/
	public void deleteReferral(Referal ob1) {
        ob1=null;
        ob1.view();
        }
}
	



