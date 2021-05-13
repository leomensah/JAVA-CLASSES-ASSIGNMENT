package assignments;
/* Write a program to print the area of a rectangle by creating 
 * a class named 'Area' taking the values of its length and breadth 
 * as parameters of its constructor and having a method named 'returnArea' 
 * which returns the area of the rectangle. The length and breadth of the 
 * rectangle are entered through the keyboard.
 */

import java.util.Scanner;
public class Q4 {
	
	public static void main(String[] args) {
		
		int length =0 ;
		int breadth = 0;
		
		Scanner inputval = new Scanner(System.in);
		
		while(length <= 0) {
			System.out.print("Enter length of rectangle: ");
			length = inputval.nextInt();
		}
		
		while(breadth <= 0) {
			System.out.print("Enter breadth of rectangle: ");
			breadth = inputval.nextInt();
		}
		
		Area rect = new Area(length, breadth);
		System.out.println("The area of the rectangle is " + rect.returnArea());
		
	}
}
