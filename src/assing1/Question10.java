package assing1;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		int temp = n;
		int original = n;
		int leofnum = 0;
		for (int i = 0; temp != 0; i++) {
			int d = temp % 10;
			temp = temp / 10;
			leofnum++;
		}

		int armstrongnum = 0;
		for (int i = 0; n != 0; i++) {
			int d = n % 10;
			armstrongnum = armstrongnum + (int) Math.pow(d, leofnum);
			n = n / 10;
		}

		if (armstrongnum == original) {
			System.out.println(original + " Is Armstrong Number");
		} else {
			System.out.println(original + " Is not Armstrong Number");
		}
	}
}
