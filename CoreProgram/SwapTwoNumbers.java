package CoreProgram;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int numberOne;
		int numberTwo;
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value numberOne and numberTwo");
		numberOne = scanner.nextInt();
		numberTwo = scanner.nextInt();
		System.out.println("Before swapping number : " +numberOne+" " +numberTwo);
		scanner.close();
		number = numberOne;
		numberOne = numberTwo;
		numberTwo = number;
		System.out.println("After swapping : " +numberOne+ " "+numberTwo);
	}
}


