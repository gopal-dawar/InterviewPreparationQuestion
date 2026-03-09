package assing1;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();

		int f = 1;

		for (int i = n; i > 1; i--) {
			f = f * i;
		}
		System.out.println(f);
	}
}
