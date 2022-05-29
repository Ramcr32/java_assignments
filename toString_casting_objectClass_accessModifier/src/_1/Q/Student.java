package _1.Q;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	public Student() {
//		System.out.println("i am zero argument constructor");
	};
	public Student(int roll, String name, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		
	}
	public void displayDetails() {
		System.out.println("Roll no:" +roll);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(grade);
	}
	public char calculateGrade() {
		if (marks>=500) {
			return 'A';
		}else if(marks<500 && marks>=400) {
			return 'B';
		}
		else {
			return 'C';
		}
			
	}
	//getter & setter
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
