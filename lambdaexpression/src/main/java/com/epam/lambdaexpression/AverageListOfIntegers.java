package com.epam.lambdaexpression;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class AverageListOfIntegers
{
    public static void main( String[] args )
    {
    	Integer [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        List<Integer> numbers = Arrays.asList(num);
        
        System.out.println("Average of " + numbers + " is : " +
        		numbers.stream().mapToInt(n -> n).average());
    }
}
