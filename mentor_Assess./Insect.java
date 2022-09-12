


package com.practice;

public class Insect {
  int i=1,j;
  public Insect()
  {
	  j=1;
	  System.out.println("Value of i=" +i);
  }
  public static int print(String s)
  {
	  System.out.println("String =" +s);
	  return 0;
  }
      private static int x1 = print("static Insect.x1 initialized");
}
