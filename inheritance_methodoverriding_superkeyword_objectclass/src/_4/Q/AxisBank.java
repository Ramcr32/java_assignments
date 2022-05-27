package _4.Q;

public class AxisBank extends Bank {
	double rateOfInterest;
	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println(rateOfInterest);
	}
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
