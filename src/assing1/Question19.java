package assing1;

public class Question19 {
	public static void main(String[] args) {
		Question19 num = new Question19();

		System.out.println(num.num(1));
	}

	public int num(int a) {
		if (a > 99) {
			return 100;
		}
		
		System.out.println(a);
		return num(a + 1);
	}

}
