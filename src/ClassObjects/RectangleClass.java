/**
 * 
 */
package ClassObjects;

/**
 * @author Covenant Visions
 *
 */
public class RectangleClass {
	// instantiate the fields of rectangle
	/** A class field should be set as private and make 
	 * the method used to access those objects public this is call Encapsulation*/
	private double length;
	private double width;
	
	// Constructor. Note that constructor name must be the same as the class
	// default constructor are used to initialize the class objects.
	public RectangleClass() {
		length = 0;
		width = 0;
	}
	public RectangleClass(double length, double width) {
		this.length = length; // this can be set this way
		setWidth(width);// it can also be set this way. this 
	}
	// create a getter and setter method for the classObjects
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double calculatePerimeter() {
		double perimeter = (2 * length) * (2*width);
		return perimeter;
	}
	public double calculateArea() {
		double area = length * width;
		return area;
	}
}
