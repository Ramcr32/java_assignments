package com.masai2;



import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalTime lt = LocalTime.now();
		Duration d = Duration.ofHours(2);
		LocalDate ld  = LocalDate.now();
		LocalDate dob = LocalDate.of(1985, 02, 20);//(yyyy-MM-dd)
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm dd_MM_yy");
		System.out.println(ldt.format(dtf));
	}
}
