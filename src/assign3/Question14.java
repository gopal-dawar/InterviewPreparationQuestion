package assign3;

public class Question14 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 99 };
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int count = 0;
		boolean b = false;
		for (int i = 1; i <= max; i++) {
			if (i == arr[count]) {
				b = true;
				count++;
			} else {

				System.out.print(i + " ");
			}

		}
	}
}
