package assign2;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target number : ");
		int n = sc.nextInt();

		int[] arr = { 8, 7, 3, 1, 2 };

		System.out.println("Given arrasy!");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == n) {
					System.out.println("[" + arr[i] + "," + arr[j] + "]");
				}
			}
		}

	}
}
