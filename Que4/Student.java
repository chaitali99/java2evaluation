package Que4;

public class Student extends Person{
	
	int studId;
	String courseEnrolled;
	int courseFee;
	public Student(int studId, String courseEnrolled, int courseFee) {
		this.studId = studId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "Student id"+studId+"\n"+"Course Name: "+courseEnrolled+"\n"+"Course Fee"+courseEnrolled;
	}
}
