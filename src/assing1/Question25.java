package assing1;

import java.util.Scanner;

public class Question25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		String[] strarr = str.trim().split(" ");
		String[] temp = new String[strarr.length];

		for (int i = 0; i < strarr.length; i++) {
			String str1 = strarr[i];
			String str2 = "";
			for (int j = str1.length() - 1; j >= 0; j--) {
				str2 = str2 + str1.charAt(j);
			}
			temp[i] = str2;
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
