package assign2;

public class Question4 {
	public static void main(String[] args) {
		String str = "Write a Java program to count the number of words in a sentence without ";

		String str1 = "";
		String[] temp = new String[str.length()];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch != ' ') {
				str1 = str1 + ch;
			} else {
				temp[count++] = str1;
				str1 = "";
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
