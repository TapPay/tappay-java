package com.tappay.exception;

/**
 * TapPayServerConnectException will be thrown if there is any connective error.
 *
 */
public class TapPayServerConnectException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -485455041997143838L;
	private String message;

	public TapPayServerConnectException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
