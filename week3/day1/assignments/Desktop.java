package week3.day1.assignments;

public class Desktop extends Computer{
	public  void desktopSize() {
		System.out.println("this is desktop");
		

	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}

}
