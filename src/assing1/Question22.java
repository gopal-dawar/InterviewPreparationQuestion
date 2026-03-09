package assing1;

public class Question22 {
	public static void main(String[] args) {

		int[] arr = { 8, 7, 3, 1, 2 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest number : " + min);
	}

}
