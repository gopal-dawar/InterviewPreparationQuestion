package assign5;

public class Question16 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		int indexpos = 2;
		int element = 100;

		arr[indexpos] = element;

		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
}
