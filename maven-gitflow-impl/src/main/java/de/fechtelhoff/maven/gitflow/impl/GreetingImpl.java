package de.fechtelhoff.maven.gitflow.impl;

import de.fechtelhoff.maven.gitflow.api.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of the Greeting-API.
 */
public class GreetingImpl implements Greeting {

	private static final Logger LOG = LoggerFactory.getLogger(GreetingImpl.class);

	/**
	 * Generates a Greeting and log it.
	 *
	 * @param message Your fantastic message.
	 */
	@Override
	public void greet(final String message) {
		LOG.info("Hello {}!", message);
	}
}
