//Austin Alloway
//Hw 1 question 15 on p.24
//Purpose: Input price of store item
// output final price after initial 80% mark up
// and then 10% sale.

import java.util.*;

public class HW1_CH1 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//initializations
		double initialPrice;
		double markUpPrice;
		double markUpDifference;
		double saleDifference;
		double finalPrice;
		double markUpPercent;
		double salePercent;
		
		markUpPercent = 0.8;
		salePercent = 0.1;
		
		//take input of initial sale price
		System.out.println("Enter inital item price:");
		initialPrice = scan.nextDouble();
		
		// apply mark up to the initial price
		markUpDifference = initialPrice * markUpPercent;
		markUpPrice = initialPrice + markUpDifference;
		
		// apply sale to the marked up price
		saleDifference = markUpPrice * salePercent;
		finalPrice = markUpPrice - saleDifference;
		
		// output of final price
		System.out.println("The final price is: $" + finalPrice);
		
	}

}
