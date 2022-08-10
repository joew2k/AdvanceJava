/**
 * 
 */
package ClassObjects;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *
 */
public class HomeCalculatorRedo {

	/**
	 * @param args
	 * 
	 */
	private Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO instantiate objects
		HomeCalculatorRedo calculator = new HomeCalculatorRedo();
		RectangleClass kitchen = calculator.getRoom();
		RectangleClass bedroom = calculator.getRoom();
		calculator.scanner.close();
		
		double area = calculator.calculateTotalArea(kitchen, bedroom);
		
		System.out.println("The total area is " + area);

	}
	
	public RectangleClass getRoom() {
		System.out.println("Enter the length");
		double length = scanner.nextDouble();
		
		System.out.println("Enter the width");
		double width = scanner.nextDouble();
		
		RectangleClass area = new RectangleClass(length, width);
		return area;
	}
	public double calculateTotalArea(RectangleClass rectangle1, RectangleClass rectangle2) {
		return rectangle1.calculateArea() + rectangle2.calculateArea();
	}

}
