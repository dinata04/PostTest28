package Posttest28;

import java.util.Scanner;

public class SoalSatu {

	public static void main(String[] args) {

		for (int number = 1; number <= 100; number++) {
			System.out.print(number);

			if (number % 3 == 0 && number % 5 == 0) {
				System.out.print("BIZZBUZZ");
			} else if (number % 3 == 0) {
				System.out.print("BIZZ");
			} else if (number % 5 == 0) {
				System.out.print("BUZZ");
			}
			System.out.print("," + " ");
		}

	}

}
