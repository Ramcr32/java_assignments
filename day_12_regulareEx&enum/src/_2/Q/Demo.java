package _2.Q;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(Pattern.matches("[A-Za-z]{3,8}", name) && 
				Pattern.matches("[6789][0-9]{9}", mobileNum) &&
				Pattern.matches("[0-9]{12}", aadharCard)) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
//		System.out.println(Pattern.matches("[A-Za-z]{3,8}", "aa"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("name : ");
		String name= sc.next();
		System.out.println("mobile number: ");
		String mobile = sc.next();
		System.out.println("aadhar number: ");
		String aadhar = sc.next();
		
		Demo demo = new Demo();
		if(demo.validate(name, mobile, aadhar)) {
			Citizen person = new Citizen(name, aadhar, mobile);
			System.out.println(person);
		}else {
			System.out.println("invalid input");
		}
		
	}
}
