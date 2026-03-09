package assing1;

public class Question11 {
	public static void main(String[] args) {

		int[] arr = { 12, 12, 1, 2, 3, 4, 4, 5, 6, 7, 9 };

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i; j < arr.length; j++) {
				if (i != j && arr[j] == arr[i]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(arr[i]);
			}
		}

	}
}
