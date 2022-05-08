package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {
	// Sort the array

	// loop through the array (start i from arr[0] till the length of the array)

	// check if the iterator variable is not equal to the array values respectively

	// print the number arr[i+1]-

	// once printed break the iteration

		public static void main(String[] args) {

			Integer[] arr = { 1, 2, 3, 4, 7, 6, 8 };
			List<Integer> list = Arrays.asList(arr);
			Collections.sort(list);
			System.out.println(list);
			int length = list.size();
			for (int i = 0; i < length; ++i) {
				if (i == (list.get(i) - 1)) {
					System.out.println("");

				} else {
					System.out.println(1 + i);
					break;

				}
			}

		}
}
