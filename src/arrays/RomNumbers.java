package arrays;

import java.util.Scanner;

public class RomNumbers {

	public static void main(String[] args) {
		// char[] romNumbers = new Char[7];

		char[] romNumbers = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] valRomNumbers = { 1, 5, 10, 50, 100, 500, 1000 };

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while (true) {

			System.out.println("Enter a roman number:");
			String input = scanner.nextLine();

			if (input.equals("quit")) {
				System.out.println("Exiting Program!");
				System.exit(0);
			}

			char[] inputCharArray = input.toCharArray();

			for (int i = 0; i < inputCharArray.length; i++) {
				System.out.println(inputCharArray[i] + ":i = " + i);
				for (int j = 0; j < romNumbers.length; j++) {
					System.out.println(romNumbers[j] + ": i = " + i + " :j = " + j);
					if (inputCharArray[i] == romNumbers[j]) {
						// System.out.println("true");
						sum += valRomNumbers[j];
					}

				}

			}
			System.out.println("sum = " + sum);

		}

	}

}
