package _4.Q;

import java.util.Scanner;

public class Demo {
	public static Bank getBank(String bank) {
		if(bank.equals("axis")) {
			return new AxisBank();
		} 
		else if(bank.equals("icici")) {
			return new ICICIBank();
		}
		else {
			return null;
		}
		
	}
	public static void main(String[] args) {
		//axis bank object
		Scanner sc = new Scanner(System.in);
		System.out.println("axis bank details......................");
		AxisBank bank1= (AxisBank)  Demo.getBank("axis");
		bank1.branchName=sc.next();
		bank1.ifscCode="BANK8755";
		bank1.rateOfInterest=5.5;
		bank1.displayDetails();
		bank1.getCreditCard();
		
		//icicibank object
		System.out.println("icici bank details......................");
		ICICIBank bank2=(ICICIBank) Demo.getBank("icici");
		bank2.branchName="raipur";
		bank2.ifscCode="BANK7875451661";
		bank2.rateOfInterest=8.6;
		bank2.displayDetails();
		
	}
}
