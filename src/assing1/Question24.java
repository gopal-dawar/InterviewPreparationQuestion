package assing1;

public class Question24 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 6, 8, 8, 9, 2, 2 };
		int count = 0;
		int[] temp = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			boolean b = false;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					b = true;
					break;
				}
			}
			if (!b) {
				temp[count++] = arr[i];
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}

	}
}
