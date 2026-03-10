package assign2;

public class Question14 {
	public static void main(String[] args) {
		String str = "a23bcde";

		if (str.matches("^[a-zA-Z]+$")) {
			System.out.println("Only String");
		} else {
			System.out.println("Contain some special symbol or number");
		}
	}
}
