package week4.day1.assignments;

import java.util.Arrays;

public class SortingUsingCollection {
	public static void main(String[] args) {
		String name[]= {"Google","Microsoft","TestLeaf","Maverick"};
		int size = name.length;
		Arrays.sort(name);
		for (int i = name.length-1; i>=0; i--) {
			System.out.println(name[i]);
		}
		
	}

}
