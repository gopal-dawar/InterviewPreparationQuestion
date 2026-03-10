package assign2;

public class Question13 {

	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 2, 10 };
		int[] diference = new int[arr.length];

		for (int i = 0; i < arr.length - 1; i++) {
			diference[i] = Math.abs(arr[i] - arr[i + 1]);
		}

		for (int i = 0; i < diference.length - 1; i++) {
			System.out.print(diference[i] + " ");
		}

	}
}
