package com.recursion;

public class Fib {
	static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int total){    
	    if(total>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(total-1);    
	     }    
	 }    
	 public static void main(String args[]){    
	  int total=10;    
	  System.out.print(n1+" "+n2);    
	  printFibonacci(total-2);   
	 }  
	}  


