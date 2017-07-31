package com.tappay.response.direct;

import com.google.gson.annotations.SerializedName;

import com.tappay.response.BankTransactionTime;
import com.tappay.response.CardInfo;
import com.tappay.response.TapPayResponse;
/**
 * Use PayByTokenResponse to retrieve PayByToken response data from TapPay.
 *
 */
public class PayByTokenResponse extends TapPayResponse {

	@SerializedName("rectradeid")
	private String recTradeId;
	@SerializedName("orderid")
	private String orderId;
	@SerializedName("authcode")
	private String authCode;
	private String acquirer;
	@SerializedName("millis")
	private long createMillis;
	@SerializedName("banktransactiontime")
	private BankTransactionTime bankTransactionTime;
	@SerializedName("cardinfo")
	private CardInfo cardInfo;
	@SerializedName("bankresultcode")
	private String bankResultCode;
	@SerializedName("bankresultmsg")
	private String bankResultMsg;

	public String getRecTradeId() {
		return recTradeId;
	}

	public void setRecTradeId(String recordId) {
		this.recTradeId = recordId;
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
		return "PayByTokenResponse [status=" + status + ", message=" + message + ", recTradeId=" + recTradeId
				+ ", orderId=" + orderId + ", authCode=" + authCode + ", acquirer=" + acquirer + ", createMillis="
				+ createMillis + ", bankTransactionTime=" + bankTransactionTime + ", bankResultCode=" + bankResultCode
				+ ", bankResultMsg=" + bankResultMsg + ", cardInfo=" + cardInfo + "]";
	}

}
