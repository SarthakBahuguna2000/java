package com.practice;
import java.util.*;
public class Search {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
    		int i,n,search,flag=0;
		
		int[] a = {11,12,13,14,15};
		n=a.length;
 
    		
		
		System.out.println("Enter the element to be seached");
		search = sc.nextInt();
    		for(i=0;i<n;i++)
    		{
        		if(a[i]==search)
        		{
            			System.out.println("Element "+search+" found at "+i+" position");
            			flag=1;
            			break;
        		}
    		}
    		if(flag==0)
    		{
        		System.out.println("Element "+search+" not found");
    		}
	}
}


