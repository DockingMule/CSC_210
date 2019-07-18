// Austin Alloway
// HW problem # 6 on p.175
// Purpose: 
//		Create a program that takes an employees gross pay and
//		apply taxes with given tax rates. Output deductions
//		from each tax and final net pay.

import java.util.*;
public class HW2_Ch3 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initializations
		double grossPay;
		double netPay;
		String employeeName;
		double totalDeductions;
		double federalTaxRate = 0.15;
		double stateTaxRate = 0.035;
		double ssTaxRate = 0.0575;
		double medTaxRate = 0.0275;
		double pensionPlanRate = 0.05;
		double healthInsuranceDeduction = 75.00;
		double federalTaxDeduction;
		double stateTaxDeduction;
		double ssTaxDeduction;
		double medTaxDeduction;
		double pensionPlanDeduction;
		
		// Gather employees gross pay and name from user
		System.out.println("Enter employees name: ");
		employeeName = scan.nextLine();
		System.out.println("Enter employees gross pay: ");
		grossPay = scan.nextDouble();
		
		// Apply tax deductions to get net pay
		// Federal Tax
		federalTaxDeduction = grossPay * federalTaxRate;
		// State Tax
		stateTaxDeduction = grossPay * stateTaxRate;
		// Social Security Tax
		ssTaxDeduction = grossPay * ssTaxRate;
		// Medicare/Medicaid Tax
		medTaxDeduction = grossPay * medTaxRate;
		// Pension Plan
		pensionPlanDeduction = grossPay * pensionPlanRate;
		// Apply deductions to get net pay
		totalDeductions = (healthInsuranceDeduction + federalTaxDeduction
				+ stateTaxDeduction + ssTaxDeduction + medTaxDeduction 
				+ pensionPlanDeduction);
		
		netPay = grossPay - totalDeductions;
		
		// Output each deduction as well as net pay
		System.out.println("\n" + employeeName);
		System.out.printf("%-30s $ %10.2f %n" , "Gross Amount:",  grossPay);
		System.out.printf("%-30s $ %10.2f %n" , "Federal Tax:",  federalTaxDeduction);
		System.out.printf("%-30s $ %10.2f %n" , "State Tax:",  stateTaxDeduction);
		System.out.printf("%-30s $ %10.2f %n" , "Social Security Tax:",  ssTaxDeduction);
		System.out.printf("%-30s $ %10.2f %n" , "Medicare/Medicaid Tax:",  medTaxDeduction);
		System.out.printf("%-30s $ %10.2f %n" , "Pension Plan:",  pensionPlanDeduction);
		System.out.printf("%-30s $ %10.2f %n" , "Health Insurance:",  healthInsuranceDeduction);
		System.out.printf("%-30s $ %10.2f %n" , "Net Pay:",  netPay);
	}

}
