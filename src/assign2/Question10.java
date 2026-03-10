package assign2;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		String name = "Java Full Stack developer";

		System.out.println(name);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character for remove : ");
		char ch = sc.next().charAt(0);

		String s1 = "";
		for (int i = 0; i < name.length(); i++) {
			char ch1 = name.charAt(i);

			if (ch != name.charAt(i)) {
				s1 = s1 + ch1;
			}
		}

		System.out.println(s1);
	}
}
