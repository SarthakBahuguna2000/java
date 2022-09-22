package com.practice;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StreamFilter {

 public static void main(String[] args)
{
	  
    List<Integer> list = Arrays.asList(5,67,95,32,14,15);

    list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
}
}
