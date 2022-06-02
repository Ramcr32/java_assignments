package _1.Q;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		if(amount>=1000) {
			return new TajHotel();
		}else if(amount>200 && amount<1000) {
			return new RoadSideHotel();
		}
		
		return null;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Demo d = new Demo();
		System.out.println("amount:");
		int amount = sc.nextInt();
		Hotel hotel=d.provideFood(amount);
		if(hotel!=null) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
			if(hotel instanceof TajHotel) 
				((TajHotel) hotel).welcomeDrink();
			
			
		}else {
			System.out.println("please enter a valid amount!");
		}
	}
}
