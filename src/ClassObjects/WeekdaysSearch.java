/**
 * 
 */
package ClassObjects;

import java.util.Scanner;

/**
 * @author Covenant Visions
 * The program search display day of the week 
 * when a corresponding number is entered. Eg. When a user 
 * enter 1 it display Monday 
 */
public class WeekdaysSearch {

	/**
	 * 
	 * @param args
	 */
	private static String [] weekDays = {"Monday", "Tuesday", "Wednesday", 
			"Thursday", "Friday", "Saturday", "Sunday"};
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getWeekday());
		scanner.close();

	}
	public static String getWeekday() {
		System.out.println("Enter the day of the week");
		int day = scanner.nextInt()-1;
		if(day > weekDays.length) {
			return "Invalid selection";
		}
		return weekDays[day];
		
	}

}
