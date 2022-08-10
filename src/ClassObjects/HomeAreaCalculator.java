/**
 * 
 */
package ClassObjects;

/**
 * @author Covenant Visions
 *
 */
public class HomeAreaCalculator {

	/**
	 * @param args
	 * this is a program test instantiating object from another class
	 */
	public static void main(String[] args) {
		/********
		 * RECTANGLE1*
		 * 
		 * *********/
		RectangleClass room1 = new RectangleClass();
		room1.setLength(20);
		room1.setWidth(50);
		double areaRoom1 = room1.calculateArea();
		
		/********
		 * RECTANGLE2*
		 * 
		 * *********/
		RectangleClass room2 = new RectangleClass(70, 80);
		double areaRoom2 = room2.calculateArea();
		
		System.out.println("The area of both rooms is " + (areaRoom1 + areaRoom2));

	}

}
