package week4.day1.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
//		Declare a String as "PayPal India"

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
		String name = "PayPal India";
		char[] charArray = name.toCharArray();
		Set<Character> charset = new LinkedHashSet<>();
		Set<Character> dupcharset = new LinkedHashSet<>();
		for (Character character : charArray) {
			if (!charset.add(character)) {
				dupcharset.add(character);
			}
			charset.removeAll(dupcharset);
			
			}
		for (Character character : charset) {
			if (character!=' ') {
				System.out.print(character);
			}
			
		} 
		
	}

}
