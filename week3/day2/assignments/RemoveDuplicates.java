package week3.day2.assignments;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String word[] = text.split(" ");
		for (int i = 0; i < word.length; i++) {
			for (int j =i+1; j < word.length; j++) {
				if(word[i].equalsIgnoreCase(word[j])) {
					word[j]="";
					count++;
				}
				
				
			}
			
		}
		System.out.println(count);
		String newstring ="";
		for (int i = 0; i < word.length; i++) {
			newstring=newstring.concat(word[i])+" ";
			
		}
		System.out.println(newstring);
	}
}
