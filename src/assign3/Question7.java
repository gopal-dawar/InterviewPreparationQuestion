package assign3;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits : ");
		int n = sc.nextInt();

		int count = 0;
		for (int i = 0; n != 0; i++) {
			int d = n % 10;
			count++;
			n = n / 10;
		}

		System.out.println("Number of digits : " + count);
	}
}
