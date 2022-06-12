package _2.Q;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EmployeeBonus eb = new EmployeeBonus();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter joining date in dd-MM-yyyy format");
		String join = sc.next();
			
			try {
				double bonus = eb.getBonus(join);
				System.out.println("bonus : "+bonus);
			} catch (InvalidAge e) {
				
				System.out.println(e.getMessage());
			}
			
		
		
	}
}
