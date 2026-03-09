package assing1;

import java.util.Scanner;

public class Queston21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String str = sc.nextLine();

		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}

		if (str.equals(str1)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String not Palindrome");

		}

	}
}
