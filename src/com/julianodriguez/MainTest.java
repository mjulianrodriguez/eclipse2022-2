package com.julianodriguez;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	private final Main calculator = new Main();

	@Test
	void testSuma() {
		assertEquals(5, calculator.suma(3, 2));
	}

	@Test
	void testResta() {
		assertEquals(10, calculator.resta(25, 15));
	}

	@Test
	void testMultiplicacion() {
		assertEquals(8, calculator.multiplicacion(4, 2));
	}

	@Test
	void testDivide() {
		assertEquals(5, calculator.divide(25, 5));
		assertEquals(0, calculator.divide(25, 0));
	}

}
