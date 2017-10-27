package com.tappay.request.record;

import com.google.gson.annotations.SerializedName;

/**
 * GetRecordFiltersPaymentType is used to add filter of payment type in GetRecordFilters.
 *
 */
public class GetRecordFiltersPaymentType {

	@SerializedName("direct_pay")
	private Boolean directPay;
	@SerializedName("apple_pay")
	private Boolean applePay;
	@SerializedName("android_pay")
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

		/**Get direct-pay record if this filter is added in GetRecordFilters.
		 * @return
		 */
		public Builder directPay() {
			this.directPay = true;
			return this;
		}

		/**Get applePay record if this filter is added in GetRecordFilters.
		 * @return
		 */
		public Builder applePay() {
			this.applePay = true;
			return this;
		}

		/**Get androidPay record if this filter is added in GetRecordFilters.
		 * @return
		 */
		public Builder androidPay() {
			this.androidPay = true;
			return this;
		}

		/**Build GetRecordFiltersPaymentType for adding filter in payment type in GetRecord API.
		 * @return GetRecordFiltersPaymentType
		 */
		public GetRecordFiltersPaymentType build() {
			return new GetRecordFiltersPaymentType(this);
		}
	}

}
