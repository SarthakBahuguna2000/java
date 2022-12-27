package com.bhavna;
import java.util.HashMap;
import java.util.Map;

public class DemoExample{
	//traversing the string from left to right
	//with the help of a start and end index keeping track of current substring with non-repeating characters
	// output the longest non-repeating substring
	public static String longestSubstring(String input) {
	    Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    for (int start = 0, end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar)+1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	        }
	        visited.put(currChar, end);
	    }
	    return output;
	}
	public static void main(String args[]) {
		String result=longestSubstring("GEEKSFORGEK");
		System.out.println(result);
	}
}