package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	/*
	 Pseudo Code:
	 1) Arrange the array in ascending order
	 2) Pick the 2nd element from the last and print it
	 */
	
	public static void main(String[] args) {

		Integer[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> asList = Arrays.asList(data);
	
		Collections.sort(asList);
		System.out.println(asList);
		
		int size = asList.size() - 2;
		System.out.println("Second Largest Number is: " +(asList.get(size)));

	}
}
