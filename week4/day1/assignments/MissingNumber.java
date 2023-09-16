package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int a[]= {1,2,2,3,4,5,6,6,7,9,10};
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i <=a.length-1; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		List<Integer> list = new ArrayList<>(set);
		int text = list.size();
	for (int i = 0; i <text; i++) {
		if (list.get(i)!=i+1) {
				System.out.println(i+1);
				break;
		}
		}
		}
	    
    
}   

