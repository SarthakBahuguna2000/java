package com.practice;

public class Stack {
	public static void main(String[] args)
    {
        StackUsingLl obj
            = new StackUsingLl();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.display();

        obj.pop();
    
        obj.display();

    }
}
 
class StackUsingLl {
	Node top;
    private class Node {
 
        int data;
        Node next;
    }
    

    public void push(int x)
    {
      Node temp = new Node();

      if (temp == null)
       {
         System.out.println(" Overflow");
         return;
        }
        temp.data = x;
        temp.next = top;
        top = temp;
     }
    public void pop() 
    {
        
        if (top == null) {
            System.out.print("Underflow");
            
            return;
        }
        top = top.next;
    }
 
    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            
            
        }
        else {
            Node temp = top;
            while (temp != null) {

                System.out.println( temp.data);
                temp = temp.next;
            }
        }
    }
}

