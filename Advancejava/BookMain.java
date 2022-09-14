package com.practice;

import java.util.*;
public class BookMain {



   public static void main(String[] args) {
       
        ArrayList<Book> lst=new ArrayList<Book>();
        lst.add(new Book(1,"Past memory",       1001,"anuj sharma"));
        lst.add(new Book(2,"The rented house",1002,"shreya"));
        lst.add(new Book(3,"Journey",1003,"sarthak"));
        
        
        
        System.out.println("Book_ID\tName\t\t\tPrice\tAuthor");
        for(Book b:lst) {
            b.display();
        }
        
        System.out.println();
        Collections.sort(lst);
        System.out.println("Book_ID\tName\t\t\tPrice\tAuthor");
        for(Book b:lst) {
            b.display();
        }
    }



}