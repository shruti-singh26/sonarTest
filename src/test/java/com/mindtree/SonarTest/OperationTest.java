package com.mindtree.SonarTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest{

	@Test
	public void AdditionTestCase(){

		assertEquals(4,Operations.Addition(2,2));
		assertEquals(5, Operations.Addition(2, 3));
		assertEquals(-4, Operations.Addition(-1, -3));

	}

	@Test
	public void MultiplicationTestCase(){

		assertEquals(16, Operations.Multiplication(4, 4));
		assertEquals(16, Operations.Multiplication(4, 4));
		assertEquals(20, Operations.Multiplication(4, 5));

	}
}
