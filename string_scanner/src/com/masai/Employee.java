package com.masai;

import java.util.Scanner;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void calculateNetSalary(int pfpercentage) {
		
		netSalary=salary-(salary*pfpercentage/100);
		System.out.println(netSalary);
	}
	

}
