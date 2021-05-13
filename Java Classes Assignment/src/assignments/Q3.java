package assignments;
/* Write a program to print the area of two rectangles
 * having sides (4,5) and (5,8)respectively by creating
 * a class named 'Rectangle' with a method named 'Area' 
 * which returns the area and length and breadth passed 
 * as parameters to its constructor.
 */

public class Q3 {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4,5);
		Rectangle rectangle2 = new Rectangle(5,8);
		
		
		System.out.println("The Area of rectangle with length "+ rectangle1.length + " and breadth "+
		rectangle1.breadth + " is = " + rectangle1.Area());
		
		System.out.println("The Area of rectangle with length " +  rectangle2.length +
				" and breadth " + rectangle2.breadth + " is = " + rectangle2.Area());
		
	}
}
