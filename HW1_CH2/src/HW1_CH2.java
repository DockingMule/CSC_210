import java.util.*;

public class HW1_CH2 {
	
    static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double milkPerCarton = 3.78;
		
		double costPerLiter = 0.38;
		
		double profitPerCarton = 0.27;
		
		double milkProduced;
		int totalCartons;
		double totalCost;
		double totalProfit;
		
		//Obtain amount of milk produced
		System.out.println("Enter the amount of milk produced: ");
		milkProduced = scan.nextDouble();
		
		//Find how man cartons are required for produced milk
		if((milkProduced / milkPerCarton) % 1 == 0)
			totalCartons = (int)(milkProduced / milkPerCarton);
		else
			totalCartons = ((int)(milkProduced / milkPerCarton) + 1);
		System.out.println("Total number of cartons = " + totalCartons);
		
		//Calculate total costs of producing milk
		totalCost = milkProduced * costPerLiter;
		System.out.println("Total cost of milk production = $" + totalCost);
		
		//Calculate Profit from produced milk
		totalProfit = totalCartons * profitPerCarton;
		System.out.println("Total profit from milk cartons = $" + totalProfit);


	}

}
