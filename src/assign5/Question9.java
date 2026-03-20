package assign5;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		int n = Question9.fact(5);

		System.out.println(n);
	}

	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fact(n - 1) * n;
		}
	}
}
