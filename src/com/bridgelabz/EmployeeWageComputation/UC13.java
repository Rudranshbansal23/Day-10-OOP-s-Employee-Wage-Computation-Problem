package com.bridgelabz.EmployeeWageComputation;

public class UC13 {
	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		System.out.println("Calculating wages for employees");
		EmpWage empWageBuilder = new EmpWage();
		empWageBuilder.addCompanyDetailsForEmpWage("Mahindra", 10, 20, 16);
		empWageBuilder.addCompanyDetailsForEmpWage("magic", 20, 20, 20);
		empWageBuilder.addCompanyDetailsForEmpWage("goldman", 10, 20, 10);
		empWageBuilder.companyEmpWage();
	}
}