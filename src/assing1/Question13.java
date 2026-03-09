package assing1;

public class Question13 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 8, 9, 99 };
		int track = 0;

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int[] missingnumber = new int[max];

		for (int i = 1; i <= max; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				missingnumber[i] = i;
			}
		}
		for (int i = 0; i < missingnumber.length; i++) {
			if (missingnumber[i] == 0) {
				continue;
			} else {
				System.out.print(missingnumber[i] + " ");
			}
		}
	}
}
