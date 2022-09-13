package com.bhavna.assessment;
import java.util.*;
public class AshaSoftware {
	static int count=0;
	
	public static void main(String[] args)
	{
		 
	    
	    Accounts ob=new Accounts();
	    ob.registration();
	    Search ob1=new Search();
	    ob1.setRestid(1001);
	    ob1.setDistance(1);
	    ob1.setLocation("Delhi");
	    ob1.setRating(4);
	    ob1.setRname("TheTwo");
	    System.out.println(ob1.getRestid() + " " + ob1.getRname() +" " + ob1.getLocation() + " " + ob1.getRating());
	    Search ob2=new Search();
	    ob2.setRestid(1002);
	    ob2.setDistance(1.5);
	    ob2.setLocation("Delhi");
	    ob2.setRating(3);
	    ob2.setRname("TheThree");
	    System.out.println(ob2.getRestid() + " " + ob2.getRname() +" " + ob2.getLocation() + " " + ob2.getRating());
	    Search ob3=new Search();
	    ob3.setRestid(1003);
	    ob3.setDistance(0.5);
	    ob3.setLocation("Delhi");
	    ob3.setRating(4.5);
	    ob3.setRname("Theone");
	    System.out.println(ob3.getRestid() + " " + ob3.getRname() +" " + ob3.getLocation() + " " + ob3.getRating());
	    Search ob4=new Search();
	    ob1.setRestid(1004);
	    ob4.setDistance(0.5);
	    ob4.setLocation("Delhi");
	    ob4.setRating(5);
	    ob4.setRname("TheFour");
	    System.out.println(ob4.getRestid() + " " + ob4.getRname() +" " + ob4.getLocation() + " " + ob4.getRating());
	    System.out.println(count);
	    if (count<5)
	    {
	    	Search ob5=new Search();
		    ob1.setRestid(1005);
		    ob4.setDistance(5);
		    ob4.setLocation("Delhi");
		    ob4.setRating(5);
		    ob4.setRname("TheFive");
		    System.out.println(ob4.getRestid() + " " + ob4.getRname() +" " + ob4.getLocation() + " " + ob4.getRating());
	    }
	}
	

	}

     
     
    
     
    
    
   
     