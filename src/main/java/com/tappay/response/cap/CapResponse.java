package com.tappay.response.cap;

import com.google.gson.annotations.SerializedName;
import com.tappay.response.TapPayResponse;

public class CapResponse extends TapPayResponse {

	@SerializedName("cap_millis")
	private Long capMillis;

	public Long getCapMillis() {
		return capMillis;
	}

	public void setCapMillis(Long capMillis) {
		this.capMillis = capMillis;
	}

	public CapResponse(Long capMillis) {
		super();
		this.capMillis = capMillis;
	}

	@Override
	public String toString() {
		return "CapResponse [capMillis=" + capMillis + "]";
	}

}
