package assing1;

public class Question9 {
	public static void main(String[] args) {
		int[] arr = { 7, 8, 2, 92, 1, 3, 11, 12 };

		int large = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}

		System.out.println(large);

	}
}
