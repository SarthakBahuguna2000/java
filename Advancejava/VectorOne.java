package com.practice;
import java.util.*;  
public class VectorOne {
	
	 
	       public static void main(String args[]) {  
	          Vector<String> vec = new Vector<String>();  
	          vec.add("Three");  
	          vec.add("one");  
	          vec.add("four");  
	          vec.add("five"); 
	          System.out.println("Elements are: "+vec);  
	          System.out.println("Size is: "+vec.size());  
	          System.out.println("Default capacity is: "+vec.capacity());  
	          vec.insertElementAt("Two", 2);
	          vec.remove(("five"));
	          System.out.println("Elements are: "+vec);  

}
}
