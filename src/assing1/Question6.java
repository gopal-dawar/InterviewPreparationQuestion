package assing1;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the first number : ");
//		int n1 = sc.nextInt();
//
//		System.out.println("Enter the second number : ");
//		int n2 = sc.nextInt();

//		System.out.println("Befor swapping : a : " + n1 + " b : " + n2);
//		int temp = n1;
//		n1 = n2;
//		n2 = temp;
//
//		System.out.println("After swapping : a : " + n1 + " b : " + n2);

		int a = 30;
		int b = 20;
// without third variable 
		System.out.println("Befor swapping : a : " + a + " b : " + b);

		a = a - b + a - b;
		b = (a + b + a) / 2;

		System.out.println("Befor swapping : a : " + a + " b : " + b);

	}
}
