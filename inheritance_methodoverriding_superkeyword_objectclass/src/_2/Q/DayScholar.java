package _2.Q;

public class DayScholar extends Student{
	double transportFee;
	
	@Override
	public double payFee(double pay) {
		// TODO Auto-generated method stub
		return this.transportFee-super.payFee(pay);
	}
}
