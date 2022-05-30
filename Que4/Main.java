package Que4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person newStudent=genaeratePerson(new Student(1,"Fullstack",23000));
		Person newTeacher=genaeratePerson(new Instructor(123,258000));

		System.out.println(newStudent);
		System.out.println(newTeacher);
	}
	public static Person generatePerson(Person person) {
		
		person.address.city="Amravti";
		person.address.state="Maha";
		person.address.pinCode="444708";
		
		
		
		return person;
	}

}
