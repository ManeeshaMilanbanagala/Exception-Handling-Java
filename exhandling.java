package exse;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exhandling {

	public static void main(String[]args) {
		
		int a;
		int b;
		int c;
		
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.println("Enter your first number");
			a = scn.nextInt();
			
			System.out.println("Enter your secound number");
			b = scn.nextInt();
			
			c = a/b;
			
			System.out.println("Answer is "+c);
		}
		catch (ArithmeticException e) {
			System.out.println("You cant Div by that number for this calculation");		}
		
		catch (InputMismatchException e) {
			System.out.println("You cant enter the double values");		}
		finally {
			System.out.println("Enjoye your day");
		}
		
		 
	}
}