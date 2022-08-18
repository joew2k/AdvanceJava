/**
 * 
 */
package ClassObjects;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *
 */
public class Grade {

	/**
	 * @param args
	 */
	private static int grades[];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How many sbject did you take");
		grades = new int[scanner.nextInt()];
		getGrades();
		System.out.println("The sum is " + sum());
		System.out.println("The highest grade is " + highest());
		System.out.println("The lowest grade is " + lowest());
		System.out.println("The average grade is " + average());

	}
	public static int[] getGrades() {
		
	for(int i = 0; i<grades.length; i++) {
		System.out.println("Enter grade for #" + (i+1));
		grades[i] = scanner.nextInt();
	}
	return grades;
	}
	public static int sum() {
		int sum = 0;
		for(int value: grades) {
			sum = sum + value;
		}
		return sum;
	}
	public static int highest() {
		int highest = grades[0];
		for(int value: grades) {
			if(value > highest) highest = value;
		}
		return highest;
	}
	public static int lowest() {
		int lowest = grades[0];
		for(int value: grades) {
			if(value < lowest) lowest = value;
		}
		return lowest;
	}
	public static double average() {
		double average = sum()/grades.length;
		return average;
	}
}
