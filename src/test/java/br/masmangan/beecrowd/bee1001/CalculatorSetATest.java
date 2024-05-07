// ********RoostGPT********
/*
Test generated by RoostGPT for test testJavaCucumber using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=setA_27c2fcf716
ROOST_METHOD_SIG_HASH=setA_c7f6a021ca

Scenario 1: Test to Check if the Value of a is Correctly Set

Details:
    TestName: testValueOfAIsSetCorrectly
    Description: This test is meant to check if the method 'setA' correctly sets the value of the integer 'a'. The target scenario is when the method is invoked with a valid integer as parameter.
  Execution:
    Arrange: Initialize a value for 'a'.
    Act: Invoke the 'setA' method with the initialized value.
    Assert: Use JUnit assertions to check if the value of 'a' is equal to the initialized value.
  Validation:
    The assertion aims to verify if the 'setA' method correctly sets the value of 'a'. The expected result is the initialized value. The significance of this test is to ensure that the 'setA' method is working as expected.

Scenario 2: Test to Check if the Value of a is Not Set to an Incorrect Value

Details:
    TestName: testValueOfAIsNotSetIncorrectly
    Description: This test is meant to check if the method 'setA' does not set the value of 'a' to an incorrect value. The target scenario is when the method is invoked with a valid integer as parameter.
  Execution:
    Arrange: Initialize a value for 'a' and an incorrect value.
    Act: Invoke the 'setA' method with the initialized value.
    Assert: Use JUnit assertions to check if the value of 'a' is not equal to the incorrect value.
  Validation:
    The assertion aims to verify if the 'setA' method does not set the value of 'a' to an incorrect value. The expected result is that the value of 'a' is not equal to the incorrect value. The significance of this test is to ensure that the 'setA' method correctly sets the value of 'a'.

Scenario 3: Test to Check if the Value of a is Set to a Negative Integer

Details:
    TestName: testValueOfAIsSetToNegativeInteger
    Description: This test is meant to check if the method 'setA' correctly sets the value of 'a' when a negative integer is passed as parameter.
  Execution:
    Arrange: Initialize a negative value for 'a'.
    Act: Invoke the 'setA' method with the negative value.
    Assert: Use JUnit assertions to check if the value of 'a' is equal to the negative value.
  Validation:
    The assertion aims to verify if the 'setA' method correctly sets the value of 'a' when a negative integer is passed as parameter. The expected result is the negative value. The significance of this test is to ensure that the 'setA' method can handle negative integers.
*/

// ********RoostGPT********
package br.masmangan.beecrowd.bee1001;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorSetATest {

	@Test
	public void testValueOfAIsSetCorrectly() {
		Calculator cal = new Calculator();
		int expectedValue = 10;
		cal.setA(expectedValue);
		assertEquals(expectedValue, cal.getSum());
	}

	@Test
	public void testValueOfAIsNotSetIncorrectly() {
		Calculator cal = new Calculator();
		int setValue = 10;
		int incorrectValue = 20;
		cal.setA(setValue);
		assertNotEquals(incorrectValue, cal.getSum());
	}

	@Test
	public void testValueOfAIsSetToNegativeInteger() {
		Calculator cal = new Calculator();
		int negativeValue = -10;
		cal.setA(negativeValue);
		assertEquals(negativeValue, cal.getSum());
	}

}