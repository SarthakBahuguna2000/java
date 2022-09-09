package com.practice;

public class BinarySearch {
	public static void main(String args[]){  
        int arr[] = {5,10,15,20,30,35};  
        int key = 25;  
        int end=arr.length-1;  
        int start=0;    
 
	int mid = (end+start)/2;  
	   while( start <= end ){  
	      if ( arr[mid] < key ){  
	        start = mid + 1;     
	      }else if ( arr[mid] == key ){  
	        System.out.println("Element is found at  " + mid);  
	        break;  
	      }else{  
	         end = mid - 1;  
	      }  
	      mid = (start+end)/2;  
	   }  
	   if ( start > end ){  
	      System.out.println("Element  not found");  
	   }  
	 }  
	 
	}  

