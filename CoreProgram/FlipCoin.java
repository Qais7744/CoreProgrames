package CoreProgram;

import java.util.*;

public class FlipCoin {
	public static void main(String[] args) {
				int value;
				int headcount = 0;
				int tailcount = 0;
				double heads, tails;
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter input number of times to flip the coin : ");
				value = scanner.nextInt();
				scanner.close();
				for (int i = 0; i < value; i++) {
					double random = Math.random();
					if (random > 0.5)
						headcount++;
					else
						tailcount++;
				}
				heads = Math.floor( headcount / (double) value * 100);
				tails = Math.floor( tailcount / (double) value * 100);
				System.out.println("Percentage of heads: " + heads + "%");
				System.out.println("Percentage of tails: " + tails + "%");
			}
}


