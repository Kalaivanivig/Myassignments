package week1.day2;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 4, 6, 3, 2 };

		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if ((A[i] == A[j]) && (i != j)) {
					System.out.println("Duplicate Element : " + A[j]);
				}
			}
		}
	}

}
