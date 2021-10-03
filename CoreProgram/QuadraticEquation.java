package CoreProgram;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = input.nextInt();
		System.out.print("Enter the value of b: ");
		int b = input.nextInt();
		System.out.print("Enter the value of c: ");
		int c = input.nextInt();
		int delta = b * b - 4 * a * c;
		input.close();
		
		if (delta > 0) 
		{
			int r1 = (-b + (delta)) / (2 * a);
			int r2 = (-b - (delta)) / (2 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		} 
		else if (delta == 0)
		{
			int r1 = -b / (2 * a);
			System.out.println("The root is " + r1);
		} 
		else
		{
			System.out.println("Roots are not real.");
		}
	}
}
