package assing1;

public class Question15 {
	public static void main(String[] args) {
		String str = "I wrote this code to find missing numbers in an array. Is it correct";

		String[] strarr = str.trim().split(" ");
		int wordscount = 0;
		for (int i = 0; i < strarr.length; i++) {
			wordscount++;
		}
		System.out.println("Words in given String : " + wordscount);
	}
}
