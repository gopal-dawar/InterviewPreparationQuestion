package assing1;

public class Question11 {
	public static void main(String[] args) {

		String str = "programming";

		for (int i = 0; i < str.length(); i++) {
			boolean flag = false;
			for (int j = i; j < str.length(); j++) {
				if (i != j && str.charAt(j) == str.charAt(i)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.print(str.charAt(i));
			}
		}

	}
}
