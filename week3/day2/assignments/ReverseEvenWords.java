package week3.day2.assignments;

public class ReverseEvenWords {
public static void main(String[] args) {
	String test = "I am a software tester"; 
	String array[]=test.split(" ");
	for (int i = 0; i < array.length; i++) {
		if(i%2!=0) {
			System.out.print(" "+array[i]+" ");
			
		
		
	}else {
		char sai[]=array[i].toCharArray();
		 for (int j = sai.length-1; j >= 0; j--) {
			
			System.out.print(sai[j]);
			
		
	}
		
	}
	
}
}
}
