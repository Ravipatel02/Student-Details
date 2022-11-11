package ApplicationFirstUsingArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/* Let’s create an application, where user will be prompted to enter the Student details
(roll, name, marks) till the user opted out. once he will opted out, then display all the student details back.*/

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			count++;
			System.out.println("Enter Students details "+ count);
			System.out.println("Ennter a student Roll Number");
			int roll = sc.nextInt();
			
			System.out.println("Ennter Student Name");
			String name = sc.next();
			
			System.out.println("Ennter Student Marks :");
			int marks = sc.nextInt();
			
			Student stu = new Student(roll, name, marks);
			studentList.add(stu);
			
			System.out.println("You are wont Exit (y/n)");
			
			String ch = sc.next();
			if(ch.equalsIgnoreCase("y")) {
				break;
			}
			
		}
		
		System.out.println("Students Detailes-----------------------");
			
		for(Student stu : studentList) {
			
			System.out.println("Student Name :"+stu.getName());
			System.out.println("Student Roll :"+stu.getRoll());
			System.out.println("Student Marks :"+stu.getMarks());
			
			System.out.println("==========================================================");
			
		}
		
		
	}

}
