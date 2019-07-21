
public class DayAdder {
	
	private static int day;
	private static int addedDays;
	
	public static void setDay(int dy){
		day = dy;
	}
	public static int getDay(){
		return day;
	}
	
	public static int add(int day1, int day2) {
		addedDays = day1 + day2;
		while (addedDays > 6)
			addedDays -= 7;
		return addedDays;
	}
	
}
