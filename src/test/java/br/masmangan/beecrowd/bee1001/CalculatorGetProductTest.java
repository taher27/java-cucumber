// ********RoostGPT********
/*
Test generated by RoostGPT for test testJavaCucumber using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=getProduct_24501888ed
ROOST_METHOD_SIG_HASH=getProduct_630a0cff5b

Scenario 1: Test the getProduct method with positive integers

Details:
  TestName: testGetProductWithPositiveIntegers
  Description: This test will validate the getProduct method when positive integers are used as input parameters.
  Execution:
    Arrange: Initialize the variables a and b with positive integer values.
    Act: Invoke the getProduct method.
    Assert: Validate if the returned value is the product of a and b.
  Validation:
    This test verifies that the getProduct method correctly multiplies positive integers. The expected result is the product of the two integer values. This test ensures the basic functionality of the method.

Scenario 2: Test the getProduct method with negative integers

Details:
  TestName: testGetProductWithNegativeIntegers
  Description: This test will validate the getProduct method when negative integers are used as input parameters.
  Execution:
    Arrange: Initialize the variables a and b with negative integer values.
    Act: Invoke the getProduct method.
    Assert: Validate if the returned value is the product of a and b.
  Validation:
    This test verifies that the getProduct method correctly multiplies negative integers. The expected result is the product of the two integer values. This test checks the method's capability to handle negative integers.

Scenario 3: Test the getProduct method with zero

Details:
  TestName: testGetProductWithZero
  Description: This test will validate the getProduct method when zero is used as an input parameter.
  Execution:
    Arrange: Initialize one of the variables a or b with zero.
    Act: Invoke the getProduct method.
    Assert: Validate if the returned value is zero.
  Validation:
    This test verifies that the getProduct method correctly handles the case when one of the parameters is zero. The expected result is zero, as any number multiplied by zero equals zero. This test examines the method's handling of zero as an input.

Scenario 4: Test the getProduct method with both positive and negative integers

Details:
  TestName: testGetProductWithPositiveAndNegativeIntegers
  Description: This test will validate the getProduct method when one input is a positive integer and the other is a negative integer.
  Execution:
    Arrange: Initialize the variables a and b with one positive and one negative integer respectively.
    Act: Invoke the getProduct method.
    Assert: Validate if the returned value is a negative number, which is the product of a and b.
  Validation:
    This test verifies that the getProduct method correctly multiplies a positive integer with a negative integer. The expected result is a negative number. This test checks the method's capability to handle mixed integers.

*/

// ********RoostGPT********
package br.masmangan.beecrowd.bee1001;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorGetProductTest {

	@Test
	public void testGetProductWithPositiveIntegers() {
		Calculator calculator = new Calculator();
		calculator.setA(5);
		calculator.setB(4);
		int expected = 20;
		int actual = calculator.getProduct();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductWithNegativeIntegers() {
		Calculator calculator = new Calculator();
		calculator.setA(-3);
		calculator.setB(-2);
		int expected = 6;
		int actual = calculator.getProduct();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductWithZero() {
		Calculator calculator = new Calculator();
		calculator.setA(0);
		calculator.setB(5);
		int expected = 0;
		int actual = calculator.getProduct();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductWithPositiveAndNegativeIntegers() {
		Calculator calculator = new Calculator();
		calculator.setA(-3);
		calculator.setB(2);
		int expected = -6;
		int actual = calculator.getProduct();
		assertEquals(expected, actual);
	}

}