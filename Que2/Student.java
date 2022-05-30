package Que2;

public class Student {
	int roll;
	String name;
	String address;
	int marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void printDetail() {
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Marks: "+marks);
	}
	
}
