package com.practice;
import java.util.*;

import java.util.List;



public class Iterator {
       public static void main(String [] args)
       {
    	   List<String> list =new ArrayList<String>();
    	   list.add("cat");
    	   list.add("dog");
    	   list.add("Tiger");
    	   list.add("Lion");
    	   ListIterator literator =list.listIterator();  
    	   while(literator.hasNext())
    	   {
    		   String name=(String)literator.next();
    		   System.out.println(name);
    	   }
    	   		
       }
}
