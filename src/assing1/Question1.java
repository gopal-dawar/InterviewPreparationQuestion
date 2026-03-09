package assing1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		int rev = 0;

		for (int i = 0; n != 0; i++) {
			int d = n % 10;
			rev = rev * 10 + d;
			
			n = n / 10;
		}

		System.out.println(rev);

	}
}
