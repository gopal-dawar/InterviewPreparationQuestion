package assign2;

public class Question8 {
	public static void main(String[] args) {
		String str = "Java Full Stack Developer";
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			count++;
//		}
//
//		System.out.println(count);
//		System.out.println(str.length());

		Question8 q = new Question8();
		int result = q.count(str.substring(1));
		System.out.println(result + 1);

		System.out.println(str.length());
	}

	public int count(String str) {
		if (str.isEmpty()) {
			return 0;
		}
		return 1 + count(str.substring(1));
	}

}
