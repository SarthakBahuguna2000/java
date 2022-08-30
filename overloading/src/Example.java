package overloading;

public class Example {
 
		   void sum(int a, int b) 
		   { 
		     int s = a + b; 
		     System.out.println("Sum of two numbers: " +s); 
		   } 
	
		   void sum(int a, int b, int c) 
		   { 
		     int t = a + b + c; 
		     System.out.println("Sum of three numbers: " +t); 
		   } 
		  
 
public static void main(String[] args) 
{ 
   Example a = new Example(); 
    a.sum(10, 20);  
    a.sum(50, 100, 200);  
  } 
}
