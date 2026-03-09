package assing1;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();

		boolean b = true;

		if (n == 0) {
			b = false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					b = false;
					break;
				}
			}
		}

		if (b) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not prime number");
		}
	}
}
