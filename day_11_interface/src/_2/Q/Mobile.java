package _2.Q;

import java.util.Scanner;

public class Mobile {
	String[] outdatedModel = {"note4","note5","note6","note7"};
	void searchOutdatedModel(String company ,String model, String... i ){
		for(String x: i) {
			if (model.equals(x)) {
				System.out.println(x+"_OUTDATED");
			}
		}
	}
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		Scanner sc = new Scanner(System.in);
		System.out.println("mobile model:");
		String userModel= sc.next();
		mobile.searchOutdatedModel("nokia",userModel, mobile.outdatedModel);
		
	}
}
