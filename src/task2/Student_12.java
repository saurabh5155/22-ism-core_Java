package task2;

import java.util.Scanner;

public class Student_12 {
	int studentId=0;
	public Student_12() {
		
		studentId = (int) (Math.random()*1000);
	}
	
	Scanner sc= new Scanner(System.in);
	String name=new String();
	String email=new String();
	String password = new String();
	public void get() {
		System.out.println("Enter Name");
		name = sc.nextLine();
		
		System.out.println("Enter email");
		email= sc.nextLine();
		
		System.out.println("Enter password");
		password = sc.nextLine();
		
	}
	
	public void print() {
		System.out.println("StudentId\tStudent Name\tStudent email \t Student password");
		System.out.println(studentId+"\t      "+name+"\t         "+email+"\t        "+password);
//		System.out.println("StudentId = "+studentId);
//		System.out.println("Student Name = "+name);
//		System.out.println("Student email = "+email);
//		System.out.println("Student password = "+password);
		
	}
	public static void main(String[] args) {
		Student_12 student = new Student_12();
		student.get();
		student.print();
	}
}
