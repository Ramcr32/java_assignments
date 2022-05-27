package _2.Q;

public class Main {
	public static void main(String[] args) {
		DayScholar d1 = new DayScholar();
		DayScholar d2 = new DayScholar();
		Hosteller h1 =new Hosteller(700.1);
		Hosteller h2 = new Hosteller(654.32);
		
		
		d1.studId=01;
		d1.studName="ram";
		d1.examFee=100;
		d1.transportFee=500;
		d1.displayDetails();
		System.out.println("remaining fees: "+d1.payFee(100));
		
		
		d2.studId=02;
		d2.studName="ram1";
		d2.examFee=100;
		d2.transportFee=500;
		d2.displayDetails();
		System.out.println("remaining fees: "+d2.payFee(300));
		
		h1.studId=03;
		h1.studName="ram";
		h1.examFee=100;
		
		h1.displayDetails();
		System.out.println("remaining fees: "+h1.payFee(200));
		
		
		h2.studId=04;
		h2.studName="ram1";
		h2.examFee=100;
		
		h2.displayDetails();
		
		System.out.println("remaining fees: "+h2.payFee(500));
		
		
	}
}
