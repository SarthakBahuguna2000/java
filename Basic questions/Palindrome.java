package com.Threenumber;

public class Palindrome {
	public static void main(String args[]){  
		  int r,total=0,temp;    
		  int n=101;  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;    
		   total=(total*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==total)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  

