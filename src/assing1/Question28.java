package assing1;

import java.util.Scanner;

public class Question28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		Question28 obj = new Question28();
		System.out.println(obj.factorial(n));
	}

	public int factorial(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}

}
