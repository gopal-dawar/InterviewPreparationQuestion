package assign3;

public class Question9 {
	public static void main(String[] args) {
		String name = "Prograpmming";

		for (int i = 0; i < name.length(); i++) {
			boolean b = false;
			for (int j = 0; j < name.length(); j++) {
				if (i != j && name.charAt(i) == name.charAt(j)) {
					b = true;
					break;
				}
			}
			if (!b) {
				System.out.println(name.charAt(i));
				break;
			}

		}
	}
}
