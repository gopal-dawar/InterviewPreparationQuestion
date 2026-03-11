package assign3;

public class Question11 {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 1, 2, 9 };

		int max = arr[0];
		int slarge = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				slarge = max;
				max = arr[i];
			} else if (arr[i] > slarge) {
				slarge = arr[i];
			}
		}

		System.out.println(slarge);
	}
}
