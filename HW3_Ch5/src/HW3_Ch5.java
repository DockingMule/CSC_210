//	Austin Alloway
//	Chapter 5 question 26 on page 325
//	Purpose: User enters radius of waxed paper
//		output length of removed sector resulting in the 
//		cup of most possible volume.

import java.util.*;
public class HW3_Ch5 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//Initializations
		double waxedPaperRad;
		double paperCupBaseRad;
		double paperCupHeight;
		double paperCupVol = 0;
		double x = 0;
		double temp;
		
		
		//gather radius of waxed paper from user
		System.out.println("Enter radius of waxed paper: ");
		waxedPaperRad = scan.nextDouble();
		
		//calculations
		do{
		temp = paperCupVol;
		x += 0.01;
		paperCupBaseRad = waxedPaperRad  - (x / (2 * Math.PI));   
		paperCupHeight = Math.sqrt(waxedPaperRad * waxedPaperRad - paperCupBaseRad * paperCupBaseRad);
		paperCupVol = (1.0 / 3.0) * Math.PI * (paperCupBaseRad * paperCupBaseRad) * paperCupHeight;
		}
		while(temp < paperCupVol);
		
		x -= 0.01; //	Do while loop causes an extra iteration
		
		System.out.printf("%-20s%.2f%n", "Max Volume: ", paperCupVol);
		System.out.printf("%-20s%.2f", "Amount Removed: ", x);
		
		
		
		
	}

}
