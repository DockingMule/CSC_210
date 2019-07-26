//	Austin Alloway
//	Question 1 on p. 634
//	Purpose:	Declare array of 50 elements
//				Have first 25 equal square of index variable
//				second 25 equal three times the index variable
//				output them 10 elements at a time.
public class HW5_Ch9 {

	public static void main(String[] args) {
		
		//	initialize the array
		double[] alpha = new double[50];
		
		//	make first 25 elements equal the square of the index
		for (int i = 0; i < 25; i++) {
			alpha[i] = i * i;
		}
		
		//	make the last 25 elements equal three times the index
		for (int i = 25; i < alpha.length; i++) {
			alpha[i] = i * 3;
		}
		
		
		//	outputs for each ten elements
		for (int i = 0; i < 10; i++) {
			System.out.printf(" %6.2f |", alpha[i]);
		}
		System.out.println();
		
		for (int i = 10; i < 20; i++) {
			System.out.printf(" %6.2f |", alpha[i]);
		}
		System.out.println();
		
		for (int i = 20; i < 30; i++) {
			System.out.printf(" %6.2f |", alpha[i]);
		}
		System.out.println();
		
		for (int i =30; i < 40; i++) {
			System.out.printf(" %6.2f |", alpha[i]);
		}
		System.out.println();
		
		for (int i = 40; i < 50; i++) {
			System.out.printf(" %6.2f |", alpha[i]);
		}
		System.out.println();

	}

}
