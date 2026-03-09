package assing1;

public class Question12 {
	public static void main(String[] args) {
		int[] n = { 8, 7, 3, 11, 1, 2 };

		int max = Integer.MAX_VALUE;
		int secondlarge = Integer.MIN_VALUE;

		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {

				secondlarge = max;

				max = n[i];
			} else if (n[i] > secondlarge && n[i] != max) {
				secondlarge = n[i];
			}
		}
		System.out.println("Second large number : " + secondlarge);

	}
}
