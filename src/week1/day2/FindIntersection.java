package week1.day2;

public class FindIntersection {
	public static void main(String args[]) {
		int a1[] = { 23, 70, 93, 34, 42 };
		int a2[] = { 34, 42, 19, 33, 55 };
		System.out.println("Intersection of the two arrays ::");

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					System.out.println(a2[j]);
				}
			}
		}
	}
}
