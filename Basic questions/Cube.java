package com.Threenumber;
import java.util.*;
 class Find {
	static void staticDisplay()
    { 
		int n = 5;
	    System.out.println("Enter a number ::");
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    System.out.println("Cube of the given number is "+(num*num*num));
    }
}
public class Cube
{
	

public static void main(String args[]){
    Find.staticDisplay();
 }
}