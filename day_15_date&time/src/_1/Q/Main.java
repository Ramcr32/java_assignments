package _1.Q;


import java.time.DateTimeException;
import java.time.LocalDate;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InvalidDateFormat {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String input = sc.next();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			LocalDate dob = LocalDate.parse(input, dtf);
			LocalDate cur = LocalDate.now();
			Period age = Period.between(dob,cur);
			
			if(age.getYears()<=0) {
				System.out.println("Date should not be in Future");
			}else {
				System.out.println("your age : "+age.getYears());
			}
		}catch(DateTimeException e) {
			InvalidDateFormat idf = new InvalidDateFormat("please Enter input in valid format");
			throw idf;
		}
			
		sc.close();
		
	}
}
