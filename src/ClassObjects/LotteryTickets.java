/**
 * 
 */
package ClassObjects;

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
			tickets[i] = random.nextInt(MAX_NUM_TICKS) + 1;
		}
		return tickets;
	}
	public static void printTickets(int[] tickets) {
		for(int i = 0; i < LENGTH; i++) {
			System.out.print(tickets[i] + " | ");
		}
	} 

}
