package CoreProgram;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		double result = 0, harmonic = 0, num;
		int value;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Harmonic number : ");
		value = scanner.nextInt();
		scanner.close();
			for (num = 1; num <= value; num++)	{
				harmonic = harmonic + (1 / num);
				result = harmonic;
			}
			System.out.println("The value of Harmonic number " +value+ " is:" +result);
		}
}

