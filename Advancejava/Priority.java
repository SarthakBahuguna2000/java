package com.practice;

import java.util.*; 
import java.util.Iterator;;
class Priority{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("shreya");  
queue.add("sarthak");  
queue.add("anuj sharma");  
queue.add("shivam uniyal");  
queue.add("friend");  
  

System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
 
System.out.println("after removing elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}  