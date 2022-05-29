package _1.Q;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("fill the details of student 1:");
		Student s1= new Student();
		System.out.println("name:");
		s1.setName(sc.next());
		System.out.println("roll no:");
		s1.setRoll(sc.nextInt());
		System.out.println("marks:");
		s1.setMarks(sc.nextInt());
		
		
		s1.setGrade(s1.calculateGrade());
		s1.displayDetails();
		System.out.println(s1);
		
		
		System.out.println("fill the details of student 2:");
		System.out.println("roll no, name , marks-");
		Student s2 = new Student(sc.nextInt(), sc.next(), sc.nextInt());
		s2.setGrade(s2.calculateGrade());
		System.out.println(s2);
		sc.close();
	}
}
