package de.fechtelhoff.maven.gitflow.impl;

import de.fechtelhoff.maven.gitflow.api.Greeting;

/**
 * Start-Class.
 */
public class Start {

	/**
	 * Main-Method of the Start-Class.
	 *
	 * @param args Commandline Parameter.
	 */
	public static void main(String[] args) {
		final Greeting greeting = new GreetingImpl();
		final String message = String.join(" ", args);
		greeting.greet(message);
	}
}
