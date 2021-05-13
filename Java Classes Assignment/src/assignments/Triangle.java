package assignments;

/* Write a program to print the area and perimeter
 * of a triangle having sides of 3, 4, and 5 units 
 * by creating a class named 'Triangle' without any
 * parameter in its constructor.
 */
import java.lang.*;
public class Triangle {
	public static int firstSide = 3;
	public static int secondSide = 4;
	public static int thirdSide = 5;
	
	public static void Area() {
		double sides = (firstSide + secondSide + thirdSide)/2;
		double res = sides*(sides - firstSide)*(sides - secondSide)*(sides - thirdSide);
		double area = Math.sqrt(res);
		
		System.out.println("The area of the triangle is "+area); 
	}
	
	public static void Perimeter() {
		int perimeter = firstSide + secondSide + thirdSide;
		System.out.println("The perimeter of the triangle is "+perimeter);
	}
}
