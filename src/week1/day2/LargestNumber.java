package week1.day2;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int[] num = { 22,67,98,1,34,58,99 };
		int length = num.length;
		Arrays.sort(num);
		System.out.println("Second Largest Number is: " + num[length - 2]);

	}
}
