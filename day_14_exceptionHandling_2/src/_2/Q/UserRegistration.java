package _2.Q;

import java.util.Scanner;

public class UserRegistration {
	void registerUser(String userCountry,String username) throws InvalidCountryException {
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name= sc.next();
		System.out.println("Enter Your Country:");
		String country= sc.next();
		
		UserRegistration ur = new UserRegistration();
		
		try {
			ur.registerUser(country, name);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		

	}

}
