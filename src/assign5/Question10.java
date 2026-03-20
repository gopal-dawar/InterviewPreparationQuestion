package assign5;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		boolean flag = true;
		if (n <= 1) {
			flag = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
		}

		if (flag) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " not prime number");
		}
	}
}
