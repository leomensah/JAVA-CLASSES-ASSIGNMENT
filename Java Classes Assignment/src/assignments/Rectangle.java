package assignments;
/* Write a program to print the area of two rectangles
 * having sides (4,5) and (5,8)respectively by creating
 * a class named 'Rectangle' with a method named 'Area' 
 * which returns the area and length and breadth passed 
 * as parameters to its constructor.
 */

public class Rectangle {
	int area = 0;
	int length;
	int breadth;
	
	public Rectangle(int bred, int len) {
		length = len;
		breadth = bred;
	}
	public int Area() {
		area = length * breadth;
		return area;
	}
}
