package assign4;

public class Question4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 9 };

		int las = arr[arr.length - 1];
		int count = 0;
		for (int i = 1; i <= las; i++) {
			if (arr[count] != i) {
				System.out.println(i);
			} else {
				count++;
			}

		}
	}
}
