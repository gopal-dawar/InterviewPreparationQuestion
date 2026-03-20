package assign4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question6 {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3 };

		List<Integer> l1 = new ArrayList<Integer>();

		for (int num : arr) {
			if (!l1.contains(num)) {
				l1.add(num);
			}
		}
		System.out.println(l1);
	}
}