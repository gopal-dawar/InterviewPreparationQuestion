package assign3;

public class Question4 {
	public static void main(String[] args) {
		int[] arr = { 111, 5, 8, 2, 10, 3, 99 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest number : " + max);
	}
}
