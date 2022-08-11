/**
 * 
 */
package ClassObjects;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *
 */
public class PhoneBillCalculator {

	/**
	 * @param args
	 */
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneBillCalculator calculator = new PhoneBillCalculator();
		
		PhoneBill cal = calculator.getPhoneBill();
		
		int phoneId = cal.getId();
		double tax =cal.calculateTax();
		double overage = cal.calculateOverage();
		double totalPhoneBill = cal.calculateTotalBill();
		double baseCost = cal.getBaseCost();
		double allotedMinutes = cal.getAllotedMinutes();
		double usedMinutes = cal.getUsedMinutes();
		
		System.out.println("Your phone bill is \r\n" + 
				"Phone ID: " + phoneId + "\r\n" +
				"Allocate Minutes: " + allotedMinutes + "\r\n" + 
				"Used Minutes: " + usedMinutes + "\r\n" + 
				"Base cost: $" + baseCost + "\r\n" + 
				"Overage cost: $" + String.format("%.2f", overage) + "\r\n" + 
				"tax: $" + String.format("%.2f", tax) + "\r\n" + 
				"Total Phone Bill: $" + String.format("%.2f", totalPhoneBill));
				
		
		
	}
	public PhoneBill getPhoneBill() {
		System.out.println("Enter your phone id: ");
		int id = scanner.nextInt();
		
		System.out.println("Enter the plan cost");
		double baseCost = scanner.nextDouble();
		
		System.out.println("Enter total allocated minutes: ");
		double allotedMinutes = scanner.nextDouble();
		
		System.out.println("Enter total used minutes: ");
		double usedMinutes = scanner.nextDouble();
		
		PhoneBill phoneBill = new PhoneBill(id, baseCost, allotedMinutes, usedMinutes);
		return phoneBill;
		


	}
	

}
