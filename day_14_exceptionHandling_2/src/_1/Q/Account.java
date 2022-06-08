package _1.Q;

public class Account {
	String accountNumber; 
	double Balance;
	
	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	void deposit( int amount) {
		this.Balance+= amount;
	}
	double withdraw(int amount) throws InsufficientFundsException {
		if(this.Balance<amount) {
			InsufficientFundsException ife = new InsufficientFundsException("insufficient balance");
			throw ife;
		}
		else {
			this.Balance-=amount;
		}
		return amount;
	}
}
