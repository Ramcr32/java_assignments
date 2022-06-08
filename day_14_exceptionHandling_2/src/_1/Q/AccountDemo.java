package _1.Q;

public class AccountDemo {

	public static void main(String[] args) {
		Account account = new Account("987456123012");
		account.deposit(500);
		try {
			account.withdraw(200);
			account.withdraw(600);
			
		} catch (InsufficientFundsException e) {
			
			System.out.println(e.getMessage());
		}finally {
			System.out.println("remaing balance: "+account.Balance);
		}
	}

}
