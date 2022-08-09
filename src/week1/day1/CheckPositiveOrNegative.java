/**
 * 
 */
package week1.day1;

/**
 * @author srikavihar
 *
 */
public class CheckPositiveOrNegative {

	public static void main(String[] args) {

		int number = 50;

		if (number > 0) {
			System.out.println("The number is positive");
		} else if (number == 0) {
			System.out.println("The number is neither positive nor negative");
		} else {
			System.out.println("The number is negative");

		}
	}
}