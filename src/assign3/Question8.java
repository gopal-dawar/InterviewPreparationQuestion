package assign3;

public class Question8 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5, 1 };

		for (int i = 0; i < arr.length; i++) {
			boolean b = false;
			for (int j = 0; j < i; j++) {

				if (arr[j] == arr[i]) {
					b = true;
					break;
				}
			}
			if (!b) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
