package com.practice;
import java.io.*;
import java.util.*;
public class CountTotal {
	 
	public void countLowerCase(FileInputStream f) {
        try {
            int cntLowerCase=0;
            while(true) {
                int i=f.read();
                if(i==-1) {
                    break;
                }else if(i>=97 && i<=122) {
                    cntLowerCase++;
                }
            }
            System.out.println("Total number of lower case character is: "+cntLowerCase);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void countUpperCase(FileInputStream f) {
        try {
            int cntUpperCase=0;
            while(true) {
                int i=f.read();
                if(i==-1) {
                    break;
                }else if(i>=65 && i<=90) {
                    cntUpperCase++;
                }
            }
            System.out.println("Total number of Upper case character is: "+cntUpperCase);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void countDigits(FileInputStream f) {
        try {
            int cntDigits=0;
            while(true) {
                int i=f.read();
                if(i==-1) {
                    break;
                }else if(i>=48 && i<=57) {
                    cntDigits++;
                }
            }
            System.out.println("Total number of digits is: "+cntDigits);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void countVowels(FileInputStream f) {
        try {
            int cntVowels=0;
            while(true) {
                int i=f.read();
                if(i==-1) {
                    break;
                }else if(i==65 || i==69 || i==73 || i==79 || i==85 || i==97 || i==101 || i==105 || i==111 || i==117) {
                    cntVowels++;
                }
            }
            System.out.println("Total number of vowel is: "+cntVowels);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}