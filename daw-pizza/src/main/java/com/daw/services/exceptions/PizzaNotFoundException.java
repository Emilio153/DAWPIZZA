package com.daw.services.exceptions;

public class PizzaNotFoundException extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8197674646749446198L;

	public PizzaNotFoundException(String message) {
		super(message);
	}
}
