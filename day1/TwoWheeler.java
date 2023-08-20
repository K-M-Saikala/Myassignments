package week1.day1;

public class TwoWheeler {
	
		int noOFWheels = 2 ;
		short noOFMirrors = 2;
		long chassisNumber = 123456789056l ;
		boolean isPunctured = false ;
		String bikeName = "yamaha" ;
		double runningKM = 20.56 ;
		
		public static void main(String[] args) {
			TwoWheeler obj = new TwoWheeler();
			System.out.println(obj.noOFWheels);
			System.out.println(obj.noOFMirrors);
			System.out.println(obj.chassisNumber);
			System.out.println(obj.isPunctured);
			System.out.println(obj.bikeName);
			System.out.println(obj.runningKM);
		}

}
