package com.practice;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StreamReduce {
	 public static void main(String[] args)
	    {
	  
	        List<Integer> array = Arrays.asList(-12, 10, 5, 60, 18);
	  
	        int sum = array.stream().reduce(0,
	                (element1, element2) -> element1 + element2);
	        System.out.println("The sum of all elements is " + sum);
}
}