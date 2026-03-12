package assign4;

public class Question3 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5, 3 };

//		Remove the dublicate from the ending
//		for (int i = 0; i < arr.length; i++) {
//			boolean b = false;
//			for (int j = i + 1; j < arr.length; j++) {
//				b = true;
//				break;
//			}
//
//			if (b) {
//				System.out.print(arr[i] + " ");
//			}
//		}
//		Remove the dublicate element from starting 
		for (int i = 0; i < arr.length; i++) {
			boolean b = false;
			for (int j = 0; j < i; j++) {
				b = true;
				break;
			}

			if (b) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
