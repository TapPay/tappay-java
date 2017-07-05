package com.tappay.exception;

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
