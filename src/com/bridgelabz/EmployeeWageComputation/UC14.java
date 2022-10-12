package com.bridgelabz.EmployeeWageComputation;

public class UC14 {
	public static void main(String args[]) {
		// welcome message
		;
		System.out.println("Calculating wages for employees");
		System.out.println("Equires for daily wages");
		
		EmpWage empWageBuilder = new EmpWage();
		
		empWageBuilder.addCompanyDetailsForEmpWage("Dominos", 10, 20, 16);
		empWageBuilder.addCompanyDetailsForEmpWage("BigBe", 20, 20, 20);
		empWageBuilder.addCompanyDetailsForEmpWage("mans", 10, 20, 10);
		
		empWageBuilder.companyEmpWage();  //enquiry
		empWageBuilder.printEmpWageForCompany();
	}
}