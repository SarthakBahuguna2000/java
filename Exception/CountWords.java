package com.practice;
 
import java.util.*;
import java.io.BufferedReader;  
import java.io.FileReader;
public class CountWords {

      public static void main(String [] args) {
    
    	       try {
    	          String line;  
    	          int count = 0;  
    	          FileReader file = new FileReader("C:\\first day git\\thetext.txt");  
    	          BufferedReader br = new BufferedReader(file);  
    	          while((line = br.readLine()) != null) {  
    
    	              String words[] = line.split(" ");  
    	              count = count + words.length;  
    	    
    	          }  
    	    
    	          System.out.println("total words " + count);  
    	          br.close();  
    	      }  
    	       catch(Exception e)
    	       {
    	    	   System.out.println(e);
    	       }
    	  }  
}







	    
	        

