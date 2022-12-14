package de.fechtelhoff.maven.gitflow.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import de.fechtelhoff.maven.gitflow.api.Greeting;

/**
 * Test-Class for the Greeting-API and -Implementation.
 */
class GreetingTest {

	/**
	 * Test the Greeting.
	 */
	@Test
	void greet() {
		final Greeting greeting = new GreetingImpl();
		Assertions.assertDoesNotThrow(() -> greeting.greet("World"));
	}
}
