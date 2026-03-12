package assign4;

import java.util.Arrays;

public class Question5 {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		boolean b = false;

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				b = true;
				break;
			}
		}

		if (!b) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings not anagram");

		}

	}
}
