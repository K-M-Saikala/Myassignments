package week3.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		// get the length of the array
		int len = arr.length;
				// declare an int variable named count
		int count = 0;
				
				// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
				
			}
			
			
		}
				
					// assign 0 to count 
					
					// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
					
							// compare both the loop variables & check they're equal
						
									// print the matching value
	}
}
