package org.test.happynum;

/**
 * Main class for 'happy' numbers printing application
 *
 */
public class Main {

	public static void main(String[] args) {
		for (int num = 1; num <= 1000; num++) {
			if (HappyNumberUtil.isHappyNumber(num)) {
				System.out.println(num);
			}
		}
	}

}
