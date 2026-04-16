package assign5;

public class Question18 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 9 };

		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			
			if (found) {
				continue;
			}
			
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					found = true;
					break;
				}
			}
			
			if (found) {
				System.out.println("Found at index : " + i + " = " + arr[i]);
			}
		}
	}
}
