package assign4;

public class Question6 {
	public static void main(String[] args) {
		String s1 = "programming";

		boolean b = false;
		for (int i = 0; i < s1.length(); i++) {
			if (b) {
				continue;
			}
			int count = 0;
			for (int j = 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					b = true;
					count++;
					break;
				}
			}
			if (!b) {
				System.out.println(s1.charAt(i) + " : " + count);
			}
		}

	}
}
