package com.epam.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PalindromesFromList {

	public static void main(String[] args) {
				
		String [] strings = {"civic", "stats", "list", "refer", "", "moM", "aA", "lalaa"};
		List<String> str = Arrays.asList(strings);
		
		Predicate<String> predicate = PalindromesFromList :: isPalindrome;
		
		List palindromes = PalindromesFromList.filterList(str, predicate);
		System.out.println(palindromes);
	}

	public static List filterList(List<String> list, Predicate<String> predicate)
	{
		List filteredList = new ArrayList<>();
		
		for(String s : list)
		{
			if(predicate.test(s.toLowerCase()))
			{
				filteredList.add(s);
			}
		}
		return filteredList;
	}
	
	public static boolean isPalindrome(String str){
		 StringBuilder reverse = new StringBuilder(str).reverse();
		    return (reverse.toString()).equals(str);
	}
}
