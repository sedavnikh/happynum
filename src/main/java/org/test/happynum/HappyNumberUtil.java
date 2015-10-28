package org.test.happynum;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility class to perform operations with happy numbers
 *
 */
public class HappyNumberUtil {

	private static final Set<Integer> DISPAIRING_NUMBERS;

	static {		
		HashSet<Integer> dispairingNumbers = new HashSet<Integer>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));
		DISPAIRING_NUMBERS = Collections.unmodifiableSet(dispairingNumbers);
	}

	/**
	 * Checks if given number is a 'happy' number
	 * 
	 * @param number
	 *            number to be checked
	 * @return <code>true</code> if given number is 'happy', <code>false</code>
	 *         otherwise
	 * 
	 * @throws IllegalArgumentException
	 *             if given number is not positive number
	 */
	public static boolean isHappyNumber(int number) {
		if (number < 1) {
			throw new IllegalArgumentException("Number to check should be greated than 0");
		}

		while (getSumOfDigitSquares(number) != 1) {
			number = getSumOfDigitSquares(number);
			if (DISPAIRING_NUMBERS.contains(number)) {
				return false;
			}
		}

		return true;
	}

	private static int getSumOfDigitSquares(int number) {
		int sumOfDigitsSquares = 0;
		while (number > 0) {
			int digit = number % 10;
			sumOfDigitsSquares += digit * digit;
			number = number / 10;
		}

		return sumOfDigitsSquares;
	}
}
