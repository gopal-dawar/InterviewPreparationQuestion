package assign2;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		int temp = n;
		int strong = 0;

		for (int i = 0; n != 0; i++) {
			int d = n % 10;

			int fact = 1;

			for (int j = d; j >= 1; j--) {
				if (d != 0) {
					fact = fact * j;
				}
			}

			strong = strong + fact;

			n = n / 10;
		}

		if (temp == strong) {
			System.out.println(temp + " is strong number");
		} else {

			System.out.println(temp + " not strong number");
		}

	}
}
