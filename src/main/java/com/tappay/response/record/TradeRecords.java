package com.tappay.response.record;

import com.google.gson.annotations.SerializedName;
import com.tappay.response.TapPayResponse;

public class TradeRecords extends TapPayResponse {
	@SerializedName("rectradeid")
	private String recTradeId;
	@SerializedName("authcode")
	private String authCode;
	@SerializedName("merchantid")
	private String merchantId;
	@SerializedName("merchantname")
	private String merchantName;
	@SerializedName("appname")
	private String appName;
	private Long time;
	private Integer amount;
	@SerializedName("refundedamount")
	private Integer refundedAmount;
	@SerializedName("recordstatus")
	private Integer recordStatus;
	@SerializedName("capmillis")
	private Long capMillis;
	@SerializedName("originalamount")
	private Integer originalAmount;
	@SerializedName("banktransactionstartmillis")
	private Long bankTransactionStartMillis;
	@SerializedName("banktransactionendmillis")
	private Long bankTransactionEndMillis;
	@SerializedName("iscaptured")
	private Boolean isCaptured;
	@SerializedName("bankresultcode")
	private String bankResultCode;
	@SerializedName("bankresultmsg")
	private String bankResultMsg;

	public String getRecTradeId() {
		return recTradeId;
	}

	public void setRecTradeId(String recTradeId) {
		this.recTradeId = recTradeId;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getRefundedAmount() {
		return refundedAmount;
	}

	public void setRefundedAmount(Integer refundedAmount) {
		this.refundedAmount = refundedAmount;
	}

	public Integer getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(Integer recordStatus) {
		this.recordStatus = recordStatus;
	}

	public Long getCapMillis() {
		return capMillis;
	}

	public void setCapMillis(Long capMillis) {
		this.capMillis = capMillis;
	}

	public Integer getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(Integer originalAmount) {
		this.originalAmount = originalAmount;
	}

	public Long getBankTransactionStartMillis() {
		return bankTransactionStartMillis;
	}

	public void setBankTransactionStartMillis(Long bankTransactionStartMillis) {
		this.bankTransactionStartMillis = bankTransactionStartMillis;
	}

	public Long getBankTransactionEndMillis() {
		return bankTransactionEndMillis;
	}

	public void setBankTransactionEndMillis(Long bankTransactionEndMillis) {
		this.bankTransactionEndMillis = bankTransactionEndMillis;
	}

	public Boolean getIsCaptured() {
		return isCaptured;
	}

	public void setIsCaptured(Boolean isCaptured) {
		this.isCaptured = isCaptured;
	}

	public String getBankResultCode() {
		return bankResultCode;
	}

	public void setBankResultCode(String bankResultCode) {
		this.bankResultCode = bankResultCode;
	}

	public String getBankResultMsg() {
		return bankResultMsg;
	}

	public void setBankResultMsg(String bankResultMsg) {
		this.bankResultMsg = bankResultMsg;
	}

	@Override
	public String toString() {
		return "TradeRecords [recTradeId=" + recTradeId + ", authCode=" + authCode + ", merchantId=" + merchantId
				+ ", merchantName=" + merchantName + ", appName=" + appName + ", time=" + time + ", amount=" + amount
				+ ", refundedAmount=" + refundedAmount + ", recordStatus=" + recordStatus + ", capMillis=" + capMillis
				+ ", originalAmount=" + originalAmount + ", bankTransactionStartMillis=" + bankTransactionStartMillis
				+ ", bankTransactionEndMillis=" + bankTransactionEndMillis + ", isCaptured=" + isCaptured
				+ ", bankResultCode=" + bankResultCode + ", bankResultMsg=" + bankResultMsg + "]";
	}
}
