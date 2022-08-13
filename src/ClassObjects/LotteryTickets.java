/**
 * 
 */
package ClassObjects;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Covenant Visions
 *
 */
public class LotteryTickets {

	/**
	 * @param args
	 * The program generates random tickets between 0-69
	 * Max number of tickets 6
	 */
	static final int LENGTH = 6;
//	static int[] tickets = new int[LENGTH];
	static final int MAX_NUM_TICKS = 69;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tickets = generateTicket();
		Arrays.sort(tickets);
		printTickets(tickets);

	}
	/**
	 * 
	 * @return
	 */
	public static int[] generateTicket() {
		Random random = new Random();
		int[] tickets = new int[LENGTH];
		for(int i = 0; i < LENGTH; i++) {
			int randomValue;
			do {
				randomValue = random.nextInt(MAX_NUM_TICKS) + 1;
			}while(search(tickets, randomValue));
			tickets[i] = randomValue;
		}
		return tickets;
	}
	/**
	 * This method search for values in an array, if the number is 
	 * found it returns a true otherwise a false. Sequential search
	 * @param array This is the array to search
	 * @param numberToSearch this is the value to search for in the array
	 * @return
	 */
	public static boolean search(int [] array, int numberToSearch) {
		for(int value: array) {
			if(value == numberToSearch) {
				return true;
			}
		}
		/**
		 * The return statement we execute after going 
		 * through all the element in the loop
		 */
		return false;
	}
	
	public static boolean binarySearch(int [] array, int numberToSearch) {
		Arrays.sort(array);
		int index = Arrays.binarySearch(array, numberToSearch);
		if (index >= 0) {
			return true;
		}
		else return false;
		
		
	}
	/**
	 * This method prints  generated ticket values
	 * @param tickets
	 */
	public static void printTickets(int[] tickets) {
		for(int i = 0; i < LENGTH; i++) {
			System.out.print(tickets[i] + " | ");
		}
	} 

}
