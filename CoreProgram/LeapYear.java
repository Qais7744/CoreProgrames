package CoreProgram;

import java.util.Scanner;

public class LeapYear {
	public static boolean leapYearCheck(int year)
	{
		if (( year > 999 && year <= 9999 ))
		{
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			{
			return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the LeapYear:");
		int year = scanner.nextInt();
		boolean result = leapYearCheck(year);
		scanner.close();
		
		if(result)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is a not leap year");
		}
	}
}

