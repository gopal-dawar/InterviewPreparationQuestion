package assign2;

public class Question3 {
	public static void main(String[] args) {
		String name = "Gopal";

		for (int i = 0; i < name.length(); i++) {
			int ch = (int) (name.charAt(i));
			System.out.println(name.charAt(i) + " : " + ch);
		}

	}
}
