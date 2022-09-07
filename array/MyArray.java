package com.practice;
import java.util.Scanner;
class SolveIt
{
	int n;
	int sum , evensum,oddsum;
	public  SolveIt(int n, int sum, int evensum,int oddsum)
	{
		this.n=n;
		this.sum=sum;
		this.evensum=evensum;
		this.oddsum=oddsum;
				
	}
	public void calculate()
	{
		
      Scanner sc=new Scanner(System.in);  
	
	  n=sc.nextInt();   
	int[] array = new int[10];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<n; i++)  
	{  
   
	array[i]=sc.nextInt();  
	}  
	System.out.println("Array elements are: ");  
	 
	for (int i=0; i<n; i++)   
	{  
	System.out.println(array[i]);  
	}  
	for (int i = 0; i < array.length; i++) {  
        sum = sum + array[i];  
        
	}  
	System.out.println("Sum of array elements=" +sum);
	for(int i = 0; i < n; i++)
    {
        if(array[i] % 2 == 0)
        {
            evensum = evensum + array[i];
        }
        else
        {
            oddsum = oddsum + array[i];
        }
    }
	System.out.println("Sum of array even elements=" +evensum);
	System.out.println("Sum of array odd elements=" +oddsum);
}
}

public class MyArray {
	public static void main(String[] args)   
	{  
	SolveIt ob =new SolveIt(0,0,0,0);
	ob.calculate();
	
	}
}
