package com.recursion;

public class Table {
	 static void multi(int n,int i)
	{
		 if(i>10)
		 {
			 return ;
		 }
		System.out.println(n*i);
		multi(n,i+1);
	}
public static void main(String [] args)
{
	int n=6;
	multi(n,1);
}
}
