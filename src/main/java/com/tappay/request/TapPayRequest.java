package com.tappay.request;

import com.google.gson.Gson;

public class TapPayRequest {

	public String toJson() {
		return new Gson().toJson(this);
	}
}
