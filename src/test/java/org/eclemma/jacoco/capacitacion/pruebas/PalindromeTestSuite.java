package org.eclemma.jacoco.capacitacion.pruebas;

import static org.junit.Assert.assertTrue;

import org.eclemma.jacoco.capacitacion.Palindrome;
import org.junit.Test;

public class PalindromeTestSuite {

	@Test
	public void whenEmptyString_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
	
}
