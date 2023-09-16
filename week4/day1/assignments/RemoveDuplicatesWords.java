package week4.day1.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i <=split.length-1; i++) {
			set.add(split[i]);
		}
		System.out.println(set);
		String exp ="";
		for (String string : set) {
			exp=exp+" "+string;
		}
		System.out.println("the expected result is: "+exp);
	}

}
