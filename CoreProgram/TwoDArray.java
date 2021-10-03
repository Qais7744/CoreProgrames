package CoreProgram;

import java.util.Scanner;

public class TwoDArray {
	static final int CONSTANT_ONE = 0;
	static int[][] array = new int[2][6];

	public static void arrayUserInput(int rowLength, int columnLength)
	{
		@SuppressWarnings("resource")
		Scanner inputObeject = new Scanner(System.in);
		for (int i = CONSTANT_ONE; i < rowLength; i++)
			for (int j = CONSTANT_ONE; j < columnLength; j++)
			{
				System.out.printf("Enter [%d][%d] value\n", i, j);
				array[i][j] = inputObeject.nextInt();
			}
	}

	public static void printArray(int rowLength, int columnLength)
	{
		for (int i = CONSTANT_ONE; i < rowLength; i++)
			for (int j = CONSTANT_ONE; j < columnLength; j++)
				System.out.printf("[%d][%d] = %d ", i, j, array[i][j]);
	}

	public static void main(String[] args)
	{
		int rowLength = array.length;
		int columnLength = array[0].length;
		System.out.println("Number : ");
		arrayUserInput(rowLength, columnLength);
		printArray(rowLength, columnLength);
	}
	
}
