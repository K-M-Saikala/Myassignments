package week3.day2.assignments;

import java.util.Arrays;

public class MissingElentinArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		// Sort the array	
		Arrays.sort(arr);

				// loop through the array (start i from arr[0] till the length of the array)
        for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!=i) {
				System.out.println(arr[i]);
				
				
			}
			
		}
					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
	}

}
