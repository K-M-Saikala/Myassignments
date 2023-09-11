package week3.day2.assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("the student id : "+id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("the student id and name "+id+" " +name);

	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("the student email and phonenumber  "+email+" & "+phonenumber);

	}
	public static void main(String[] args) {
		Students obj= new Students();
		obj.getStudentInfo(2);
		obj.getStudentInfo(2, "Saikala");
		obj.getStudentInfo("saikala74738@gmail.com", 48837683768L);
	}

}
