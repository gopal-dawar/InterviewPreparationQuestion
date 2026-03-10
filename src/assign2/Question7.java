package assign2;

public class Question7 {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 2 };

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}

		int avg = total / arr.length;

		System.out.println("Average of array element : " + avg);

	}
}
