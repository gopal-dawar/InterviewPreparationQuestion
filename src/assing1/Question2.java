package assing1;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		int rev = 0;
		int temp = n;

		for (int i = 0; n != 0; i++) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}

		if (rev == temp) {
			System.out.println(temp + " Is palindrome number");

		} else {
			System.out.println(temp + " is not palindrome");
		}

	}

}
