package assign2;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int temp = n;
		int d = 0;
		boolean b = false;
		for (int i = 0; i <= n / 2; i++) {

			if (i * i == temp) {
				b = true;
				d = i;
				break;
			}
		}

		if (b) {
			System.out.println(temp + " is perfect square of : " + d);
		} else {

			System.out.println(temp + " is not perfect square");
		}

	}
}
