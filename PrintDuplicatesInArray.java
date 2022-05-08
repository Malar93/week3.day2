package week3.day2;

import java.util.Arrays;
import java.util.List;

public class PrintDuplicatesInArray {

public static void main(String[] args) {
		
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> list = Arrays.asList(arr);
		
		// get the length of the array
			
		int length = list.size();
		for(int i=0;i<=length-1;i++) {
			for(int j=i+1;j<length;j++) {
				
				// compare both the loop variables & check they're equal
				// Out of the inner loop, check and print the first array variable if count is more than 0
				
				if(list.get(i).equals(list.get(j))) {
					System.out.println(list.get(i));
					break;
				}
			}

		}
}
}