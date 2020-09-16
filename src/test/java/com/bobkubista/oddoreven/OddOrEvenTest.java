package com.bobkubista.oddoreven;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class OddOrEvenTest {

	private OddOrEven ooe = new OddOrEven();

	@Test
	void testEmptyArray() {
		int[] numbers = {};
		assertTrue(ooe.isEven(numbers));
	}

	@Test
	void testEvenSingleValue() {
		int[] numbers = { 2 };
		assertTrue(ooe.isEven(numbers));
	}

	@Test
	void testOddSingleValue() {
		int[] numbers = { 1 };
		assertFalse(ooe.isEven(numbers));
	}

	@Test
	void testEvenDoubleValue() {
		int[] numbers = { 2, 6 };
		assertTrue(ooe.isEven(numbers));
	}

	@Test
	void testOddDoubleValue() {
		int[] numbers = { 1, 3 };
		assertTrue(ooe.isEven(numbers));
	}

	@Test
	void testOddAndEvenValues() {
		int[] numbers = { 1, 2 };
		assertFalse(ooe.isEven(numbers));
	}

	@Test
	void testNegativeValues() {
		int[] numbers = { 0, -1, -5 };
		assertTrue(ooe.isEven(numbers));
	}
}
