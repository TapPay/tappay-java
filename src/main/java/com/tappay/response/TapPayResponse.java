package com.tappay.response;

import com.google.gson.annotations.SerializedName;

public class TapPayResponse {

	protected int status;
	@SerializedName("msg")
	protected String message;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
