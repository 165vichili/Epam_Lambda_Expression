package com.epam.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class StringStartsWithA {

	public static void main(String[] args) {
		
		String [] str = {"", "as", "banana", "app", "ADD", "alter", "case", "alt", "aa", "aaa"};
		List<String> s = Arrays.asList(str);
		
		System.out.println("Before Filtering : " + s);
		
		List<String> filteredList = s.stream()
									 .filter(p -> p.length() == 3)
									 .filter(p -> p.charAt(0) == 'a' || p.charAt(0) == 'A')
									 .collect(toList());
									 
		System.out.println("After Filtering : " + filteredList);
	}

}
