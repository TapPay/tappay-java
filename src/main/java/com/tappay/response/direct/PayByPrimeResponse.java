package com.tappay.response.direct;

import com.google.gson.annotations.SerializedName;
import com.tappay.response.BankTransactionTime;
import com.tappay.response.CardInfo;
import com.tappay.response.CardSecret;
import com.tappay.response.TapPayResponse;

public class PayByPrimeResponse extends TapPayResponse {

	@SerializedName("rectradeid")
	private String recordId;
	@SerializedName("orderid")
	private String orderId;
	@SerializedName("authcode")
	private String authCode;
	private String acquirer;
	@SerializedName("millis")
	private long createMillis;
	@SerializedName("cardsecret")
	private CardSecret cardSecret;
	@SerializedName("banktransactiontime")
	private BankTransactionTime bankTransactionTime;
	@SerializedName("cardinfo")
	private CardInfo cardInfo;

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(String acquirer) {
		this.acquirer = acquirer;
	}

	public long getCreateMillis() {
		return createMillis;
	}

	public void setCreateMillis(long createMillis) {
		this.createMillis = createMillis;
	}

	public CardSecret getCardSecret() {
		return cardSecret;
	}

	public void setCardSecret(CardSecret cardSecret) {
		this.cardSecret = cardSecret;
	}

	public BankTransactionTime getBankTransactionTime() {
		return bankTransactionTime;
	}

	public void setBankTransactionTime(BankTransactionTime bankTransactionTime) {
		this.bankTransactionTime = bankTransactionTime;
	}

	public CardInfo getCardInfo() {
		return cardInfo;
	}

	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}

	@Override
	public String toString() {
		return "PayByPrimeResponse [status=" + status + ", message=" + message + ", recordId=" + recordId + ", orderId="
				+ orderId + ", authCode=" + authCode + ", acquirer=" + acquirer + ", createMillis=" + createMillis
				+ ", cardSecret=" + cardSecret + ", bankTransactionTime=" + bankTransactionTime + ", cardInfo="
				+ cardInfo + "]";
	}

}
