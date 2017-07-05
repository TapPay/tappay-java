package com.tappay.response;

import com.google.gson.annotations.SerializedName;

public class CardSecret {

	@SerializedName("cardkey")
	private String cardKey;
	@SerializedName("cardtoken")
	private String cardToken;

	public String getCardKey() {
		return cardKey;
	}

	public void setCardKey(String cardKey) {
		this.cardKey = cardKey;
	}

	public String getCardToken() {
		return cardToken;
	}

	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
	}

	@Override
	public String toString() {
		return "CardSecret [cardKey=" + cardKey + ", cardToken=" + cardToken + "]";
	}

}
