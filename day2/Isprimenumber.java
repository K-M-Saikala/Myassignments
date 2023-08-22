package week1.day2;

public class Isprimenumber {
	public static void main(String[] args) {
		int n = 10 , flag = 0;
		int m=n/2;
		for (int i = 2; i<=m; i++) {
			if (n%i==0) {
				System.out.println("the number is not a prime");
				flag = 1 ;
				break;	
			}
			if (flag==0) {
				System.out.println("the number is prime");
				break;
			}
			
		}
	}

}
