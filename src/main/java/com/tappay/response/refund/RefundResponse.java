package com.tappay.response.refund;

import com.google.gson.annotations.SerializedName;
import com.tappay.response.TapPayResponse;

public class RefundResponse extends TapPayResponse {

	@SerializedName("refundamount")
	private Integer refundAmount;
	@SerializedName("iscaptured")
	private Boolean captured;

	public Integer getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Integer refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Boolean getCaptured() {
		return captured;
	}

	public void setCaptured(Boolean captured) {
		this.captured = captured;
	}

	@Override
	public String toString() {
		return "RefundResponse [status=" + status + ", message=" + message + "refundAmount=" + refundAmount
				+ ", captured=" + captured + "]";
	}

}
