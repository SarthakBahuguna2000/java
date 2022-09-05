package com.practice;
import java.util.*;
public class Area {
	
	

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println(" 1 for Circle");
			System.out.println(" 2 for Rectangle");
			System.out.println(" 3 for Square");
			System.out.println(" 4 for Hexagon");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter value of radius: ");
				int radius=sc.nextInt();
				Circle obj=new Circle(radius);
				System.out.println("Area of Circle: "+obj.calculateArea());
			    
			
			}else if(choice==2) {
				System.out.print("Enter length: ");
				int length=sc.nextInt();
				System.out.print("Enter breadth: ");
				int breadth=sc.nextInt();
				Rectange obj=new Rectange(length,breadth);
				System.out.println("Area of Rectangle: "+obj.calculateArea());
			}else if(choice==3) {
				System.out.print("Enter the side value: ");
				int side=sc.nextInt();
				Square obj=new Square(side);
				System.out.println("Area of Square: "+obj.calculateArea());
			}
				else if(choice==4) {
					System.out.print("Enter the side value: ");
					int side=sc.nextInt();
					Hexagon obj=new Hexagon(side);
					System.out.println("Area of Hexagon: "+obj.calculateArea());
				
			}else {
				System.out.println("Invalid choice");
			}
			

		}

	}

