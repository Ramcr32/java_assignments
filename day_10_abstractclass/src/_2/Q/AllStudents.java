package _2.Q;

import java.util.Scanner;

public class AllStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name and address");
		  ScienceStudent sciencest= new ScienceStudent(sc.next(),sc.next());
		  
		  System.out.println("chemistry marks:");
		  sciencest.chemistryMarks=sc.nextInt();
		  System.out.println("maths marks:");
		  sciencest.mathsMarks=sc.nextInt();
		  System.out.println("physics marks");
		  sciencest.physicsMarks=sc.nextInt();
		  System.out.println(sciencest.getPercentage()+"%");
		  System.out.println(sciencest);
		  
		  
		  System.out.println("name and address");
		  HistoryStudent historyst= new HistoryStudent(sc.next(),sc.next());
		  
		  System.out.println("History marks:");
		  historyst.historyMarks=sc.nextInt();
		  System.out.println("civics marks:");
		  historyst.civicsMarks=sc.nextInt();
		  
		  System.out.println(historyst.getPercentage()+"%");
		  System.out.println(historyst);
	}
}
