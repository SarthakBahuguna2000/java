package com.practice;
import java.io.*;
import java.util.*;


       

public class CountUppercaseAndLowercase {
	 public static void main(String [] args){
		 try {
		 File file=new File("C:\\first day git\\thetext.txt");
         if(file.exists() && file.isFile()) {
             FileInputStream fin=new FileInputStream(file);
             CountTotal obj=new CountTotal();
             obj.countDigits(fin);
             fin=new FileInputStream(file);
             obj.countLowerCase(fin);
             fin=new FileInputStream(file);
             obj.countUpperCase(fin);
             fin=new FileInputStream(file);
             obj.countVowels(fin);
             
         }
		 }
         catch(Exception e) {
             System.out.println(e);
         }
	 }
	 }
