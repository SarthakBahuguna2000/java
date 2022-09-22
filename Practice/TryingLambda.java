package com.practice;


public class TryingLambda {
	
	 
	 public static void main( String[] args ) {
		 Subtraction ob =new Subtraction();
		    ob.subtract();
		   
		    MyInterface ref;
		    
		    ref = () -> 3.1415;
		    
		    System.out.println("Value of Pi = " + ref.getPiValue());
		    
		    } 
}
