import java.util.*;
public class Menu {
	
	public static int showMenu() {
		Scanner scan = new Scanner (System.in);
		int selection;
		System.out.println("Please choose from the following selection: \n"
				+"1.) Set the day\n"
				+"2.) Print the day\n"
				+ "3.) Print the next day\n"
				+ "4.) Print the previous day\n"
				+ "5.) Add day to current day\n"
				+ "6.) Exit");
		
		selection = scan.nextInt();
		
		return selection;
	}
	
	public static void lines() {
		System.out.println("------------------------------");
	}

}
