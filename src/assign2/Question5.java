package assign2;

public class Question5 {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 2 };
		int starting = arr[0];

		int ending = arr[arr.length - 1];

		arr[0] = ending;
		arr[arr.length - 1] = starting;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
