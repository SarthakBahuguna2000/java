package com.bhavna.Maven;
import java.util.*;

	
	public class Calculator {
	    public static void main(String[] args) {
	        System.out.println("Following are the results");
	        System.out.println();
	        CalculateFunction cal = new CalculateFunction();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter two numbers: ");
	        int a, b;
	        double c,d;
	        String e,f;
	        a = sc.nextInt();
	        b = sc.nextInt();
	        cal.add(a, b);
	        c = sc.nextDouble();
	        d = sc.nextDouble();
	        cal.add(c, d);
	        e = sc.next();
	        f = sc.next();
	        cal.add(e, f);
	        
	        cal.mul(a, b);
	        cal.sub(a, b);
	        cal.div(c, d);
	        sc.close();
	    }
	}
	


