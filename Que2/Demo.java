package Que2;
import java.util.*;
public class Demo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of student");
		int n=sc.nextInt();
		Student[] s=new Student[n];
		int r,m[];
		String name[];
		for(int i=0;i<n;i++) {
			s[i]=new Student();
			System.out.println("Enter roll no");
			s[i].setRoll(sc.nextInt());
			System.out.println("Enter name");
			s[i].setName(sc.next());
			System.out.println("Enter marks");
			s[i].setMarks(sc.nextInt());
			System.out.println("Enter Address");
			s[i].setAddress(sc.next());
			
		}
		
		float avg=0;
		for(int i=0;i<n;i++) {
			System.out.println("Display studrnt details"+(i+1));
			System.out.println("Name: "+s[i].getName());
			System.out.println("Roll: "+s[i].getRoll());
			System.out.println("Address: "+s[i].getAddress());
			avg+=s[i].getMarks();
		}
		
		System.out.println("Average marks: "+avg);
	}
	
}
