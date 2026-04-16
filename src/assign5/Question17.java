package assign5;

public class Question17 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 100 };

		int low = 0;
		int high = arr.length - 1;
		int element = 100;

		boolean found = false;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == element) {
				System.out.println("Element found at index : " + mid + " = " + arr[mid]);
				found = true;
				break;
			} else if (arr[mid] > element) {
				high = mid - 1;
			} else {

				low = mid + 1;
			}
		}
		if (!found) {
			System.out.println("Element Not found");
		}

	}
}
