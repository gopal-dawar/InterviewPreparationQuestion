package assign5;

public class Question14 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		int indexpos = 1;

		int[] newArr = new int[arr.length - 1];

		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == indexpos) {
				continue;
			} else {
				newArr[j] = arr[i];
				j++;
			}
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int n : newArr) {
			System.out.print(n + " ");
		}

	}
}
