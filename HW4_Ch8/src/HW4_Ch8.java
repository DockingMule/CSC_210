import java.util.*;
public class HW4_Ch8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int selection = 0;
		int day;
		Day day1 = new Day();
		while (selection != 6) {
			Menu.lines();
			selection = Menu.showMenu();
			
			switch(selection) {
				case(1):
					System.out.println("Enter the day to set (0-6): ");
					day = scan.nextInt();
					day1.setDay(day);
				break;
				
				case(2):
					System.out.println(Day.printDay(day1.getDay()));
				break;
				
				case(3):
					System.out.println(Day.printDay(day1.nextDay()));
				break;
				
				case(4):
					System.out.println(Day.printDay(day1.previousDay()));
				break;
				
				case(5):
				System.out.println("Enter the day to add to"
						+" previously set day: ");
				day = scan.nextInt();
				System.out.println(Day.printDay(DayAdder.add(day1.getDay(), day)));
				break;
			}
		}
	}

}
