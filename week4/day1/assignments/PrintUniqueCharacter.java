package week4.day1.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name ="saikala";
		char[] charArray = name.toCharArray();
		Set<Character> set = new HashSet<>();
		for (Character string : charArray) {
			set.add(string);
		}
		System.out.println(set);
	}

}
