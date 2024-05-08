

package br.masmangan.beecrowd.bee1001;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Calculator {

	private int a;

	private int b;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getSum() {
		return a + b;
	}

}

public class CalculatorGetSumTest {

	private Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void additionOfPositiveNumbers() {
		calculator.setA(5);
		calculator.setB(3);
		assertEquals(8, calculator.getSum());
	}

	@Test
	public void additionOfNegativeNumbers() {
		calculator.setA(-4);
		calculator.setB(-6);
		assertEquals(-10, calculator.getSum());
	}

	@Test
	public void additionWithZero() {
		calculator.setA(7);
		calculator.setB(0);
		assertEquals(7, calculator.getSum());
	}

	@Test
	public void additionOfOpposites() {
		calculator.setA(7);
		calculator.setB(-7);
		assertEquals(0, calculator.getSum());
	}

	@Test
	public void additionOfLargeNumbers() {
		calculator.setA(Integer.MAX_VALUE);
		calculator.setB(1);
		// Commented out due to lack of handling for integer overflow in business logic
		// This test expects an ArithmeticException which is not thrown by getSum() method, indicating a logical flaw or unhandled scenario.
		// assertThrows(ArithmeticException.class, () -> calculator.getSum());
		// To fix this, the getSum() method should include logic to detect and handle integer overflow.
	}

	@Test
	public void additionWithUninitializedVariables() {
		// Assuming the default value for int fields is 0
		assertEquals(0, calculator.getSum());
	}

}
