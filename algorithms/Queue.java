package com.practice;
class NodeQ
{
    int data;    
    NodeQ next;     
 
    public NodeQ(int data)
    {
       
        this.data = data;
        this.next = null;
    }
}
public class Queue {
	
	
	    private static NodeQ rear = null, front = null;
	    private static int count = 0;
	    public static int dequeue()   
	    {
	        if (front == null)
	        {
	            System.out.println("\nQueue Underflow");
	            System.exit(-1);
	        }
	 
	        NodeQ temp = front;
	        System.out.printf("Removing %d\n", temp.data);
	 
	        front = front.next;
	 
	        if (front == null) {
	            rear = null;
	        }
	 
	        count -= 1;
	 
	        return temp.data;
	    }
	 
	    public static void enqueue(int item)   
	    {
	        NodeQ node = new NodeQ(item);
	        System.out.println("Inserting %d\n" +item);
	 
	        if (front == null)
	        {
	          
	            front = node;
	            rear = node;
	        }
	        else {
	          
	            rear.next = node;
	            rear = node;
	        }
	 
	     
	    }
	   
	   
	    public static void main(String[] args)
	    {
	        Queue q = new Queue();
	        q.enqueue(10);
	        q.enqueue(12);
	        q.enqueue(13);
	        q.enqueue(14);
	 
	        
	 
	        q.dequeue();
	        q.dequeue();
	     
	 
	        
	        
	    }
	
}


