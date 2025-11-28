package com.tandemloop;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = scanner.nextInt();
		System.out.print("Output: ");

		int limit = (a % 2 == 0) ? a - 1 : a;

		for (int i = 0; i < (limit + 1) / 2; i++) {
			System.out.print((2 * i + 1));
			if (i < (limit + 1) / 2 - 1) {
				System.out.print(", ");
			}
		}
	}
}
