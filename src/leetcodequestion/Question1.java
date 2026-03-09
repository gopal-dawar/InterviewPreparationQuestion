package leetcodequestion;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question1 {
	public static void main(String[] args) {

		Question1 q = new Question1();
		int[] ar = { 1, 2, 3, 45 };
		System.out.println(q.twosum(ar, 6));

	}

	public int[] twosum(int[] num, int target) {

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {
			int complement = target - num[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
		}
		return new int[] {};
	}
}
