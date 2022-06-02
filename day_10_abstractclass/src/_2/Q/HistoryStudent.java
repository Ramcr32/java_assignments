package _2.Q;

public class HistoryStudent extends Student {
	public HistoryStudent(String name, String address) {
		super(name, address);
		
	}
	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", name=" + name
				+ ", address=" + address + "]";
	}
	@Override
	int getPercentage() {
		int sum=historyMarks+civicsMarks;
		return sum/2;
	}
	int historyMarks;
	int civicsMarks;
}
 