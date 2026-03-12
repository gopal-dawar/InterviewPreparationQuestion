package assign4;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits : ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 0; n != 0; i++) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		System.out.println("Sum of digits : " + sum);
	}
}
