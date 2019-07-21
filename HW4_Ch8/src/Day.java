
public class Day {
	private int day;
	private int previousDay;
	private int nextDay;
	
	public void setDay(int dy) {
		day = dy;
	}
	public int getDay() {
		return day;
	}
	
	public int previousDay() {
		previousDay = day - 1;
		return previousDay;
	}
	
	public int nextDay() {
		nextDay = day + 1;
		return nextDay;
	}
	
	public static String printDay(int day) {
		String convertedDay = "";
		switch(day) {
		case(0):
		convertedDay = "Sunday";
		break;
		case(1):
		convertedDay = "Monday";
		break;
		case(2):
		convertedDay = "Tuesday";
		break;
		case(3):
		convertedDay = "Wednesday";
		break;
		case(4):
		convertedDay = "Thursday";
		break;
		case(5):
		convertedDay = "Friday";
		break;
		case(6):
		convertedDay = "Saturday";
		break;
		}
		return convertedDay;
	}
}
