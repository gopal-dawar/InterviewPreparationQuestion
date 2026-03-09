package assing1;

import java.util.Scanner;

public class Question20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; n != 0; i++) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
