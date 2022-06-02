package _2.Q;

public abstract class Student {
	String name;
	String address;
	abstract int getPercentage();
	public Student() {
		
	}
	public Student(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	
}
