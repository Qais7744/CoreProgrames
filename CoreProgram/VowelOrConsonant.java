package CoreProgram;

import java.util.Scanner;

public class VowelOrConsonant
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a word : ");
		char word = read.next().charAt(0);
		read.close();
		{
		if(word == 'a' || word == 'A' || word == 'e' || word == 'E' || word == 'i' || word == 'I' || word == 'o' || word == 'O' || word == 'u' || word == 'U' )
       		{ 
        	System.out.println(word + " is vowel");
       		}
        else
        	{
            System.out.println(word + " is consonant");
        	}
		}
	}
}
