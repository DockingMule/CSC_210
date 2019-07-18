// Austin Alloway
// HW problem 16 on p.246
// Purpose: Order desired picture frame and output total cost

import java.util.*;
public class HW2_CH4 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Initializations
		double userInput_Length;
		double userInput_Width;
		double totalFramingMaterial;
		int userInput_Crowns = 0;
		String userInput_Frame;
		String userInput_Color;
		double areaOfFrame;
		double totalCost = 0.00;
		double cost_Coloring = 0.10; 		// per inch
		double cost_RegularFrame = 0.15;	// per inch
		double cost_FancyFrame = 0.25; 		// per inch
		double cost_Cardboard = 0.02;		// per square inch
		double cost_Glass = 0.07;			// per square inch
		double cost_Crown = 0.35;			// per crown
		
		// gather information from user for the length, width,
		// frame type, color, and crowning
		System.out.println("Enter the length (inches) of the frame: ");
		userInput_Length = scan.nextDouble();
		
		System.out.println("Enter the width (inches) of the frame: ");
		userInput_Width = scan.nextDouble();
		
		System.out.println("Enter the type of framing you would like (regular / fancy):");
		userInput_Frame = scan.next();
		userInput_Frame = userInput_Frame.toUpperCase();
		
		if((userInput_Frame.contentEquals("REGULAR"))||(userInput_Frame.contentEquals("FANCY")))
		{
			System.out.println("Enter the type of color you would like:");
			userInput_Color = scan.next();
			userInput_Color = userInput_Color.toUpperCase();
			
			System.out.println("Enter the amount of crowns desired (0-4):");
			userInput_Crowns = scan.nextInt();
			
		// calculate the total price
			
			//	length of total frame
			totalFramingMaterial = (2*userInput_Length) + (2*userInput_Width);
			
			//	area of the frame
			areaOfFrame = userInput_Length * userInput_Width;
			
			//	cost of coloring per inch
			if (!(userInput_Color.contentEquals("WHITE")))			// Coloring not needed if ordered in white
				totalCost += (cost_Coloring * totalFramingMaterial);
			
			//	cost of framing
			if(userInput_Frame.contentEquals("REGULAR"))
				totalCost += (cost_RegularFrame * totalFramingMaterial);
			else
				totalCost += (cost_FancyFrame * totalFramingMaterial);
			
			//	cost of crowns
				totalCost += (cost_Crown * userInput_Crowns);
				
			//	cost of cardboard
				totalCost += (cost_Cardboard * areaOfFrame);
				
			//	cost of glass
				totalCost += (cost_Glass * areaOfFrame);
				
		//output total price of the picture framing.
				System.out.printf("%-30s %n" , "Your Order:");
				System.out.printf("%-15s" + userInput_Frame + "%n" , "  Frame Type:");
				System.out.printf("%-15s" + userInput_Crowns + "%n" , "  Crowns:");
				System.out.printf("%-15s" + userInput_Color + "%n" , "  Color:");
				System.out.printf("%-15s" + userInput_Frame + "%n" , "  Frame Type:");
				System.out.printf("%-15s$%.2f %n" , "  Total Cost:", totalCost);
		}
		else
			System.out.println("Error! Not Valid Input!");
	}

}
