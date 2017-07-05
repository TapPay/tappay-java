package com.tappay.exception;

public class ArgumentsValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2209091673806215814L;
	private String message;

	public ArgumentsValidException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
