package com.tappay.request.record;

import com.google.gson.annotations.SerializedName;

public class GetRecordFiltersPaymentType {

	@SerializedName("directpay")
	private Boolean directPay;
	@SerializedName("applepay")
	private Boolean applePay;
	@SerializedName("androidpay")
	private Boolean androidPay;

	private GetRecordFiltersPaymentType(Builder builder) {
		this.directPay = builder.directPay;
		this.applePay = builder.applePay;
		this.androidPay = builder.androidPay;
	}

	public Boolean getDirectPay() {
		return directPay;
	}

	public void setDirectPay(Boolean directPay) {
		this.directPay = directPay;
	}

	public Boolean getApplePay() {
		return applePay;
	}

	public void setApplePay(Boolean applePay) {
		this.applePay = applePay;
	}

	public Boolean getAndroidPay() {
		return androidPay;
	}

	public void setAndroidPay(Boolean androidPay) {
		this.androidPay = androidPay;
	}

	public static class Builder {

		private Boolean directPay = false;
		private Boolean applePay = false;
		private Boolean androidPay = false;

		public Builder directPay() {
			this.directPay = true;
			return this;
		}

		public Builder applePay() {
			this.applePay = true;
			return this;
		}

		public Builder androidPay() {
			this.androidPay = true;
			return this;
		}

		public GetRecordFiltersPaymentType build() {
			return new GetRecordFiltersPaymentType(this);
		}
	}

}
