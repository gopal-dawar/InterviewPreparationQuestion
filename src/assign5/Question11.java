package assign5;

public class Question11 {
	public static void main(String[] args) {
		int[] arr = { 7, 8, 3, 1, 2, 9 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
