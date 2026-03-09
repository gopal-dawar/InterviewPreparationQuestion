package assing1;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();

		int vcount = 0;
		int ccount = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vcount++;
			} else {
				ccount++;
			}
		}

		System.out.println("Vowels count : " + vcount);
		System.out.println("Constraint count : " + ccount);

	}
}
