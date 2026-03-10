package assign2;

public class Question6 {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 2 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of even number : " + sum);
	}
}
