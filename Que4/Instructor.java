package Que4;

public class Instructor extends Person{

	int instructorId;
	int salary;
	public Instructor(int instructorId, int salary) {
		this.instructorId = instructorId;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Instructor [instructor Id="+instructorId+",Salary="+salary+"]";
	}
}
