package _1.Q;

import java.util.Scanner;

public class Main {
		public static String reversString(String input){
			
		//write the logic
			char c;
			String str="";
			for(int i=input.length()-1; i>=0; i--) {
				c=input.charAt(i);
				str+=c;
			}
			
			return str; 
		}
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String to reverse");
			String str = sc.next();
			String result = reversString(str);
			System.out.println("Original String is :"+ str);
			System.out.println("Reversed String is :"+ result);
			sc.close();
		}
}
