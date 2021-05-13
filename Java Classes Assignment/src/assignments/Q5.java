package assignments;
/* Print the sum, difference, and product of two
 *  complex numbers by creating a class named 'Complex'
 *  with separate methods for each operation whose real
 *  and imaginary parts are entered by the user. Please 
 *  find the implementation of an operation for your understanding.
 *  public​​static​​Complex​​divide​(Complex a, Complex b)
 *  {​return​​new​​Complex((a.real/b.real),(a.imag/b.imag));
 */
import java.util.Scanner;
public class Q5 {
	
	public static void returnAdd(Complex a, Complex b) {
		int result1 = a.real + b.real;
		int result2 = a.image + b.image;
		//return new Complex((a.real+b.real), (a.image+b.image));
		System.out.println(result1 + " + "+result2+"i");
	}
	
	public static void returnsubtract(Complex a, Complex b) {
		int result1 = a.real - b.real;
		int result2 = a.image - b.image;
		System.out.println(result1 + " + " + result2 +"i");
	}
	
	public static void returnProduct(Complex a, Complex b) {
		int resReal = (a.real * b.real) + (-1) * (a.image * b.image);
		int resImage = (a.real * b.image) + (a.image * b.real);
		System.out.println(resReal + " + " + resImage + "i");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter real part: ");
		int r1 = input.nextInt();
		
		System.out.print("Enter imaginary part: ");
		int i1 = input.nextInt();
		
		Complex a = new Complex(r1, i1);
		
		System.out.print("Enter real part: ");
		int r2 = input.nextInt();
		
		System.out.print("Enter imaginary part: ");
		int i2 = input.nextInt();
		
		Complex b = new Complex(r2, i2);
		
		returnProduct(a, b);
	}

}
