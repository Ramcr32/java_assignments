package _2.Q;

public class Student {
	int studId;
	String studName;
	double examFee;
	public void displayDetails() {
		System.out.println("student id : "+studId);
		System.out.println("student name : "+studName);
		System.out.println("exam fees : "+examFee);
		
	}
	public double payFee(double pay) {
		
		return this.examFee-pay;
	}
	public Student() {
		super();
	}
	public Student(int studId, String studName, double examFee) {
		
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	
}
