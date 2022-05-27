package _2.Q;

public class Hosteller extends Student {
	double hostelFee;

	public Hosteller(double hostelFee) {
		
		this.hostelFee = hostelFee;
	}
	@Override
	public double payFee(double pay) {
		// TODO Auto-generated method stub
		return this.hostelFee-super.payFee(pay);
	}
	
}
