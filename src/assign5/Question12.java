package assign5;

public class Question12 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4, 5, 6, 7, 7, 8 };

		for (int i = 0; i < arr.length; i++) {
			boolean b = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					b = false;
					break;
				}
			}

			if (b) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
