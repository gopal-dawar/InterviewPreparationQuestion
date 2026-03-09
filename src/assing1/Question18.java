package assing1;

public class Question18 {

	public static void main(String[] args) {

		String name = "gopal dawar";

		name = name.replace(" ", "");

		for (int i = 0; i < name.length(); i++) {

			int count = 0;
			boolean flag = true;

			for (int j = 0; j < i; j++) {
				if (name.charAt(i) == name.charAt(j)) {
					flag = false;
					break;
				}
			}

			if (flag) {

				for (int k = 0; k < name.length(); k++) {
					if (name.charAt(i) == name.charAt(k)) {
						count++;
					}
				}

				System.out.println(name.charAt(i) + " : " + count);
			}
		}
	}
}