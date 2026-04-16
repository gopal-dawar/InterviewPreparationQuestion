package assign5;

public class Question20 {
	public static void main(String[] args) {
		String[] arr = { "gopal", "dawar", "sairam" };

		for (int i = 0; i < arr.length; i++) {
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min].compareTo(arr[j]) > 0) {
					min = j;
				}
			}

			String temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

		for (String n : arr) {
			System.out.print(n + " ");
		}
	}
}
