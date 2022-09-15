package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class CountMain {
   public static void main(String [] args)
   {
	   try {
           int count=0;
           int files=0;
           File file=new File("C:\\first day git");
           File arr[] = file.listFiles();
           for(int i = 0; i<arr.length;i++) {
               if(arr[i].isDirectory()) {
                   count += 1;
               }
               else if(arr[i].isFile()) {
                   files += 1;
           }
           }
           System.out.println("Total Number of directory "+count);
           System.out.println("Total Number of file "+files);
           
       }catch(Exception e) {
           System.out.println(e);
       }
   }
}