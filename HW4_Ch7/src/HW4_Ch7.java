//	Austin Alloway
//	Question 21 on page 463
//	Purpose:	Input length and width of a rectangle cardboard piece
//				Output max volume of box made by cutting out squares
//				from each of the corners.
import java.util.*;
public class HW4_Ch7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		MaxVolumeFinder maxVol = new MaxVolumeFinder();

		double length;
		double width;
		double volume;
		
		System.out.println("Enter the length of the rectangle: ");
		length = scan.nextDouble();
		
		System.out.println("Enter the width of the recatangle: ");
		width = scan.nextDouble();
		
		//	find max volume
		maxVol.setLength(length);
		maxVol.setWidth(width);
		maxVol.findMax();				//	Also possible to do
		volume = maxVol.getVolume();	//	maxVol.findMax(length, width),
										//	would not require lines 26 and 27
		

		//outputs
		System.out.printf("Length of square sides: %.2f\n", maxVol.getsqrSide());
		System.out.printf("Max volume of box: %.2f", volume);
		
	}

}
