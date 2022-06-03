package _3.Q;

import java.util.Scanner;

public class Ipl {
	void homeTeamStadium(Stadium stadium) {
		System.out.println(stadium);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ipl demo = new Ipl();
		System.out.println("take your inpout");
		
		try {
			Stadium a=Stadium.valueOf(sc.next());
			demo.homeTeamStadium(a);
		}catch(Exception e) {
			System.out.println("invalid input");
	}
}
}
