/** Write Program to Demonstrate use of Navigableset **/


package com.practice;

import java.util.NavigableSet;
import java.util.TreeSet;

class Navigable
{
  public static void main(String args[])
  {
    NavigableSet<Integer> set = new TreeSet<Integer>();

    set.add(1);
    set.add(8);
    set.add(5);
    set.add(3);
    set.add(0);
    set.add(22);
    set.add(10);
    System.out.println(" Original NavigableSet: " + set);

    NavigableSet<Integer> rset = set.descendingSet();
    System.out.println(" Reverse order of the original NavigableSet: " + rset);
  }
}