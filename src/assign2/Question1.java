package assign2;

public class Question1 {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 2 };

		for (int i = 0; i < arr.length; i++) {
			int temp = (int) Math.pow(arr[i], 3);
			arr[i] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
