package com.practice;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class StreamLimit {
	public static void main(String[] args) {
	      IntStream intStream = IntStream.range(20, 40);
	      intStream.limit(8).forEach(System.out::println);

	}
}
