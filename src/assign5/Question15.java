package assign5;

public class Question15 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		int element = 40;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				System.out.println("Element found : " + arr[i]);
				break;
			}
		}
	}
}
