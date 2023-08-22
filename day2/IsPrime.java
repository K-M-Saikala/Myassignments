package week1.day2;

import java.util.Iterator;

public class IsPrime {
	public static void main(String[] args) {
		int n = 20;
		for (int i = 2; i <= n; i++) {
			if (n%1==0&&n%i==0&&n%(i-1)!=0) {
				System.out.println("the number is prime");
				break;
			}if (n%(i-1)==0) {
				System.out.println("the number is not prime");
				break;
				
			}
			
		}
	}

}