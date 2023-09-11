package week3.day1.assignments;

public class Automation extends MultipleLanguage implements Language,TestTool{

	@Override
	public void selenium() {
		System.out.println("this is selenium");
		
	}

	@Override
	public void java() {
		System.out.println("this is java");
		
	}

	@Override
	public void ruby() {
		System.out.println("this is ruby");
		
	}
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.python();
		obj.ruby();
		obj.java();
		obj.selenium();
	}
	

}
