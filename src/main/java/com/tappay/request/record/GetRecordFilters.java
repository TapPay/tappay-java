package com.tappay.request.record;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GetRecordFilters {

	public enum RecordStatus {
		ERROR(-1),
        AUTH(0),
        OK(0),
        PARTIALREFUNDED(2),
        REFUNDED(3);
        
        private final int value;

		RecordStatus(final int newValue) {
            value = newValue;
        }

        public int getValue() { return value; }
    }

	
	private GetRecordFiltersTime time;
	@SerializedName("paymenttype")
	private GetRecordFiltersPaymentType paymentType;
	private GetRecordFiltersAmount amount;
	@SerializedName("appid")
	private List<String> appId;
	@SerializedName("merchantid")
	private List<String> merchantId;
	@SerializedName("recordstatus")
	private Integer recordStatus;
	@SerializedName("rectradeid")
	private String recTradeId;
	@SerializedName("orderid")
	private String orderId;

	public GetRecordFilters(Builder builder) {
		this.time = builder.time;
		this.paymentType = builder.paymentType;
		this.amount = builder.amount;
		this.appId = builder.appId;
		this.merchantId = builder.merchantId;
		this.recordStatus = recordStatus == null ? null : builder.recordStatus.getValue();
		this.recTradeId = builder.recTradeId;
		this.orderId = builder.orderId;
	}

	public GetRecordFiltersTime getTime() {
		return time;
	}

	public void setTime(GetRecordFiltersTime time) {
		this.time = time;
	}

	public GetRecordFiltersPaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(GetRecordFiltersPaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public GetRecordFiltersAmount getAmount() {
		return amount;
	}

	public void setAmount(GetRecordFiltersAmount amount) {
		this.amount = amount;
	}

	public List<String> getAppId() {
		return appId;
	}

	public void setAppId(List<String> appId) {
		this.appId = appId;
	}

	public List<String> getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(List<String> merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(Integer recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getRecTradeId() {
		return recTradeId;
	}

	public void setRecTradeId(String recTradeId) {
		this.recTradeId = recTradeId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public static class Builder {

		private GetRecordFiltersTime time;
		private GetRecordFiltersPaymentType paymentType;
		private GetRecordFiltersAmount amount;
		private List<String> appId;
		private List<String> merchantId;
		private RecordStatus recordStatus;
		private String recTradeId;
		private String orderId;

		public Builder time(GetRecordFiltersTime time) {
			this.time = time;
			return this;
		}

		public Builder paymentType(GetRecordFiltersPaymentType paymentType) {
			this.paymentType = paymentType;
			return this;
		}

		public Builder amount(GetRecordFiltersAmount amount) {
			this.amount = amount;
			return this;
		}

		public Builder appId(List<String> appId) {
			this.appId = appId;
			return this;
		}

		public Builder merchantId(List<String> merchantId) {
			this.merchantId = merchantId;
			return this;
		}

		public Builder recordStatus(RecordStatus recordStatus) {
			this.recordStatus = recordStatus;
			return this;
		}

		public Builder recTradeId(String recTradeId) {
			this.recTradeId = recTradeId;
			return this;
		}

		public Builder orderId(String orderId) {
			this.orderId = orderId;
			return this;
		}

		public GetRecordFilters build() {
			return new GetRecordFilters(this);
		}
	}

}
