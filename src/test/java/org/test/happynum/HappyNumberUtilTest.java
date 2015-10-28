package org.test.happynum;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test for {@link HappyNumberUtil}
 */
public class HappyNumberUtilTest {

	@Test
	public void testHappyNumber() {
		assertTrue("The number is 'happy' but 'false' result returned. ", HappyNumberUtil.isHappyNumber(383));
	}

	@Test
	public void testSadNumber() {
		assertFalse("The number is 'sad' but 'true' result returned. ", HappyNumberUtil.isHappyNumber(384));
	}

	@Test
	public void testAmountOfHappyNumbersInInterval() {
		int amount = 0;
		for (int number = 1; number <= 1000; number++) {
			if (HappyNumberUtil.isHappyNumber(number)) {
				amount++;
			}
		}

		assertEquals("Wroung amount of 'happy' numbers counted for a interval 1 - 1000. ", 143, amount);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExecuteWithNegativeNumber() {
		HappyNumberUtil.isHappyNumber(-2);
	}
}
