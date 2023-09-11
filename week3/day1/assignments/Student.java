package week3.day1.assignments;

public class Student extends Department{
	public void studentName() {
		System.out.println("this is student name ");

	}
	public void studentDept() {
		System.out.println("this is student department");

	}
    public void studentId() {
        System.out.println("this is student id");

}
    public static void main(String[] args) {
		Student obj = new Student();
		obj.collegecode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
	}
}
