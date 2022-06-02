package _2.Q;

public class ScienceStudent extends Student{
	public ScienceStudent(String name, String address) {
		super(name, address);
		
	}
	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", name=" + name + ", address=" + address + "]";
	}
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	@Override
	int getPercentage() {
		int sum=physicsMarks+chemistryMarks+mathsMarks;
		return (sum/3);
	}
	

}
