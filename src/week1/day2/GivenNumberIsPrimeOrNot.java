package week1.day2;

public class GivenNumberIsPrimeOrNot {

	public static boolean prime(int n) {

		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static void main(String args[]) {
		if (prime(2))
			System.out.println("It is a Prime Number");
		else
			System.out.println("It is not a Prime Number");
		if (prime(20))
			System.out.println("It is a Prime Number");
		else
			System.out.println("It is not a Prime Number");
	}
}
