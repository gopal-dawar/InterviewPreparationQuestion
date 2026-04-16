package assign5;

public class Question19 {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 2 };

		for (int i = 1; i < arr.length; i++) {

			boolean swappeted = false;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swappeted = true;
				}
			}

			if (swappeted == false) {
				break;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
