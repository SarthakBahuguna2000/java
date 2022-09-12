package com.practice;

public class InsertionSort {
	       
	    public static void main(String args[]){ 
	    	int[] array = {10,4,3,6,9,1}; 
	    	int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i >=0) && ( array [i] > key ) )
	            {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }    
	           
	        System.out.println("After Insertion Sort");    
	        for(int i=0;i<n;i++){    
	            System.out.println(array[i]);    
	        }    
	    }    
	}    