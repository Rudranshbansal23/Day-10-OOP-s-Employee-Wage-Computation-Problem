package com.bridgelabz.EmployeeWageComputation;

import java.util.Scanner;

public class EmployeeWageUC10 {
	public static void main(String[] args) {

		EmployeeWage mahindra = new EmployeeWage(); // creating object for to call method

		System.out.println("How many company data you want to Enter ");
		Scanner p1 = new Scanner(System.in);
		p1.toString();
		int noOfCompanys = p1.nextInt(); // taking for how many company you want to store data

		for (int i = 1; i <= noOfCompanys; i++) {

			mahindra.check(); // calling method in object
		}
	}
}