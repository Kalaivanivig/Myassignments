package week1.day2;

public class FibonacciSeries {

	public static void fibonacci(int N) {
		int num1 = 0, num2 = 1;

		int counter = 0;

		while (counter < N) {

			System.out.print(num1 + " ");

			// Swap
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}

	public static void main(String args[]) {

		int N = 11;

		fibonacci(N);
	}
}
