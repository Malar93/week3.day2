package week3.day2;

import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */
	
	public static void main(String[] args) {
		Integer[] arr = {3,2,11,4,6,7};
		List<Integer> list = Arrays.asList(arr);

		Integer[] arr1 = {1,2,8,4,9,7};
		List<Integer> list1 =Arrays.asList(arr1);


		for (int i = 0; i<list.size(); i++)
		{
		for (int j =0; j<list1.size(); j++)
		{
		if (list.get(i)==list.get(j))
		System.out.println(list.get(i));
		}
		}
		}	
	
}
