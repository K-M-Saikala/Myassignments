package week3.day2.assignments;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		char chararray[]=test.toCharArray();
		for (int i = 0; i < chararray.length; i++) {
			
			if(i%2!=0) {
				String array = Arrays.toString(chararray);
				
				
			System.out.print(array.toUpperCase());
			break;
			}else{
				String array = Arrays.toString(chararray);
				System.out.print(array.toLowerCase());
				break;
			}
			}
			
		}

		
	}
	

