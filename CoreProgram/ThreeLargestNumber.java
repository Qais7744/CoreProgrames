package CoreProgram;

import java.util.Scanner;

public class ThreeLargestNumber
{
	public static void checkLargestNumber()
	{
		System.out.println("Enter first number :");
		int firstNumber = userInput();
		System.out.println("Enter second number :");
		int secondNumber = userInput();
		System.out.println("Enter third number :");
		int thirdNumber = userInput();
		int largestNumber = compareOperation(firstNumber, secondNumber, thirdNumber);
		System.out.println("The largest number is " + largestNumber);
	}

	public static int userInput()
	{
		@SuppressWarnings("resource")
		Scanner userInputObject = new Scanner(System.in);
		int inputValue = userInputObject.nextInt();
		return inputValue;
	}

	static int compareOperation(int firstNumber, int secondNuber, int thirdNumber)
	{
		if (firstNumber > secondNuber && firstNumber > thirdNumber)
			return firstNumber;
		else if (secondNuber > firstNumber && secondNuber > thirdNumber)
			return secondNuber;
		else
			return thirdNumber;
	}

	public static void main(String[] args)
	{
		checkLargestNumber();
	}

}

