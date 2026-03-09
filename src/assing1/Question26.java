package assing1;

import java.util.Scanner;

public class Question26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int temp = n;

		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {

			if (temp % i == 0) {
				sum = sum + i;
				System.out.println(i);
			}

		}

		if (sum == temp) {
			System.out.println("Given number is perfect");
		} else {
			System.out.println("Given number is not perfect");
		}
	}
}
