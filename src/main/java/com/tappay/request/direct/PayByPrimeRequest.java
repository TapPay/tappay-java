package com.tappay.request.direct;

import com.google.gson.annotations.SerializedName;
import com.tappay.exception.ArgumentsValidException;
import com.tappay.exception.TapPayInitialException;
import com.tappay.request.Cardholder;
import com.tappay.request.TapPayRequest;
import com.tappay.service.TapPay;
import com.tappay.utils.StringUtil;

public class PayByPrimeRequest extends TapPayRequest {

	private String prime;
	@SerializedName("partnerkey")
	private String partnerKey;
	@SerializedName("merchantid")
	private String merchantId;
	private Integer amount;
	private String currency;
	@SerializedName("ptradeid")
	private String partnerTradeId;
	@SerializedName("orderid")
	private String orderId;
	private String details;
	private Integer instalment;
	@SerializedName("authtocapperiodinday")
	private Integer authToCapPerionInDay;
	private Boolean remember;
	private Cardholder cardholder;

	private PayByPrimeRequest(Builder builder) throws TapPayInitialException {
		this.partnerKey = TapPay.getInstance().getApiKey();
		this.prime = builder.prime;
		this.merchantId = builder.merchantId;
		this.amount = builder.amount;
		this.currency = builder.currency;
		this.partnerTradeId = builder.partnerTradeId;
		this.orderId = builder.orderId;
		this.instalment = builder.instalment;
		this.authToCapPerionInDay = builder.authToCapPerionInDay;
		this.remember = builder.remember;
		this.cardholder = builder.cardholder;
		this.details = builder.details;
	}

	public static class Builder {

		private String prime;
		private String merchantId;
		private Integer amount;
		private String currency = "TWD";
		private String partnerTradeId;
		private String orderId;
		private String details;
		private Integer instalment = 0;
		private Integer authToCapPerionInDay = 0;
		private Boolean remember;
		private Cardholder cardholder;

		public Builder prime(String prime) {
			this.prime = prime;
			return this;
		}

		public Builder merchantId(String merchantId) {
			this.merchantId = merchantId;
			return this;
		}

		public Builder currency(String currency) {
			this.currency = currency;
			return this;
		}

		public Builder partnerTradeId(String partnerTradeId) {
			this.partnerTradeId = partnerTradeId;
			return this;
		}

		public Builder orderId(String orderId) {
			this.orderId = orderId;
			return this;
		}

		public Builder details(String details) {
			this.details = details;
			return this;
		}

		public Builder amount(Integer amount) {
			this.amount = amount;
			return this;
		}

		public Builder instalment(Integer instalment) {
			this.instalment = instalment;
			return this;
		}

		public Builder authToCapPerionInDay(Integer authToCapPerionInDay) {
			this.authToCapPerionInDay = authToCapPerionInDay;
			return this;
		}

		public Builder cardholder(Cardholder cardholder) {
			this.cardholder = cardholder;
			return this;
		}

		public Builder remember(Boolean remember) {
			this.remember = remember;
			return this;
		}

		public PayByPrimeRequest build() throws TapPayInitialException, ArgumentsValidException {
			if (StringUtil.isEmpty(merchantId)) {
				throw new ArgumentsValidException("Missing Arguments : MerchantId");
			}
			if (StringUtil.isEmpty(prime)) {
				throw new ArgumentsValidException("Missing Arguments : Prime");
			}
			if (StringUtil.isEmpty(details)) {
				throw new ArgumentsValidException("Missing Arguments : MerchantId");
			}
			if (cardholder == null) {
				throw new ArgumentsValidException("Missing Arguments : Cardholder");
			}
			if (remember == null) {
				throw new ArgumentsValidException("Missing Arguments : Remember");
			}
			return new PayByPrimeRequest(this);
		}
	}

	public String getPrime() {
		return prime;
	}

	public void setPrime(String prime) {
		this.prime = prime;
	}

	public String getPartnerKey() {
		return partnerKey;
	}

	public void setPartnerKey(String partnerKey) {
		this.partnerKey = partnerKey;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPartnerTradeId() {
		return partnerTradeId;
	}

	public void setPartnerTradeId(String partnerTradeId) {
		this.partnerTradeId = partnerTradeId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Integer getInstalment() {
		return instalment;
	}

	public void setInstalment(Integer instalment) {
		this.instalment = instalment;
	}

	public Integer getAuthToCapPerionInDay() {
		return authToCapPerionInDay;
	}

	public void setAuthToCapPerionInDay(Integer authToCapPerionInDay) {
		this.authToCapPerionInDay = authToCapPerionInDay;
	}

	public Boolean getRemember() {
		return remember;
	}

	public void setRemember(Boolean remember) {
		this.remember = remember;
	}

	public Cardholder getCardholder() {
		return cardholder;
	}

	public void setCardholder(Cardholder cardholder) {
		this.cardholder = cardholder;
	}

	@Override
	public String toString() {
		return "PayByPrimeRequest [prime=" + prime + ", partnerKey=" + partnerKey + ", merchantId=" + merchantId
				+ ", amount=" + amount + ", currency=" + currency + ", partnerTradeId=" + partnerTradeId + ", orderId="
				+ orderId + ", details=" + details + ", instalment=" + instalment + ", authToCapPerionInDay="
				+ authToCapPerionInDay + ", remember=" + remember + ", cardholder=" + cardholder + "]";
	}

}
