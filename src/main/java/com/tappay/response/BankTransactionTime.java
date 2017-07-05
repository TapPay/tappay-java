package com.tappay.response;

import com.google.gson.annotations.SerializedName;

public class BankTransactionTime {

	@SerializedName("starttimemillis")
	private long startTimeMillis;
	@SerializedName("endtimemillis")
	private long endTimeMillis;

	public long getStartTimeMillis() {
		return startTimeMillis;
	}

	public void setStartTimeMillis(long startTimeMillis) {
		this.startTimeMillis = startTimeMillis;
	}

	public long getEndTimeMillis() {
		return endTimeMillis;
	}

	public void setEndTimeMillis(long endTimeMillis) {
		this.endTimeMillis = endTimeMillis;
	}

	@Override
	public String toString() {
		return "BankTransactionTime [startTimeMillis=" + startTimeMillis + ", endTimeMillis=" + endTimeMillis + "]";
	}

}
