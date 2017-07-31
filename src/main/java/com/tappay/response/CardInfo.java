package com.tappay.response;

import com.google.gson.annotations.SerializedName;

public class CardInfo {

	@SerializedName("bincode")
	private String binCode;
	@SerializedName("lastfour")
	private String lastFour;
	private String issuer;
	private int funding;
	private int type;
	private String level;
	private String country;
	@SerializedName("countrycode")
	String countryCode;

	public String getBinCode() {
		return binCode;
	}

	public void setBinCode(String binCode) {
		this.binCode = binCode;
	}

	public String getLastFour() {
		return lastFour;
	}

	public void setLastFour(String lastFour) {
		this.lastFour = lastFour;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public int getFunding() {
		return funding;
	}

	public void setFunding(int funding) {
		this.funding = funding;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "CardInfo [binCode=" + binCode + ", lastFour=" + lastFour + ", issuer=" + issuer + ", funding=" + funding
				+ ", type=" + type + ", level=" + level + ", country=" + country + ", countryCode=" + countryCode + "]";
	}

}
