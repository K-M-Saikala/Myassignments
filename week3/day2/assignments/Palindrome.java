package week3.day2.assignments;

public class Palindrome {
	public static void main(String[] args) {
		
		String name = "madam";
		
		char array[] = name.toCharArray();
		String rev = "";
		//char array2[]=rev.toCharArray();
		for (int i = array.length-1; i >=0; i--) {
			
		rev+=array[i];

		}
		System.out.println(rev);
	}

}
