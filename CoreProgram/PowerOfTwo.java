package CoreProgram;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		System.out.println("Power of 2^" +num+" is : "+ (int) (Math.pow(2, num)));
		System.out.println("Printing power value " +num);
		if (num < 31)	
		{
			for (int i = 0; i <= num; i++)
			System.out.println("Power of given number is : " + (int) Math.pow(2, i));
		}
		else	{
			System.out.println("Enter the number");
		}
	}
}


