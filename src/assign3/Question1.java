package assign3;

public class Question1 {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 12, 20, 30 };
		int result = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			result = arr[i + 1] - arr[i];
		}
		int f = arr[arr.length - 1] + result + 2;
		System.out.println(f);

	}
}
