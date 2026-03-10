package assign2;

import java.util.Arrays;

public class Question16 {
	public static void main(String[] args) {
		int[] arr1 = { 8, 7, 3, 1, 2 };
		int[] arr2 = { 4, 5, 6, 7, 8, 9 };

		Arrays.stream(arr2).forEach(x -> System.out.print(x + " "));
		System.out.println();
		Arrays.stream(arr1).forEach(x -> System.out.print(x + " "));
		System.out.println();
		System.out.print("Comman element : ");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr2[j] + " ");
				}
			}
		}

	}
}
