package CoreProgram;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");
		number = scanner.nextInt();
		scanner.close();
		System.out.println("The Prime Factor of" +number+" is : ");
		
		int i =2;
		while (number > 1)	{	
			if( number%i == 0)	{
				System.out.println(i + " ");
				number = number / i;
			} else
				i++;
		}
				System.out.println(number);
	}
}

