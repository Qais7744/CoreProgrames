package CoreProgram;

import java.util.Scanner;

public class NumberEvenOrOdd {
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = read.nextInt();
		read.close();
		if(num % 2 == 0) 
			System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
	}
}
