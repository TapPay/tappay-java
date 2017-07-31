package com.tappay.request.direct;

import com.google.gson.annotations.SerializedName;
import com.tappay.exception.ArgumentsValidException;
import com.tappay.exception.TapPayInitialException;
import com.tappay.request.TapPayRequest;
import com.tappay.service.TapPay;
import com.tappay.utils.StringUtil;

/**
 * PayByTokenRequest is employed to send a PayByToken request.
 *
 */
public class PayByTokenRequest extends TapPayRequest{

	@SerializedName("cardkey")
	private String cardKey;
	@SerializedName("cardtoken")
	private String cardToken;
	@SerializedName("partnerkey")
	private String partnerKey;
	@SerializedName("merchantid")
	private String merchantId;
	private Integer amount;
	private String currency;
	@SerializedName("ptradeid")
	private String partnerTradeId;
	private String details;
	private Integer instalment;
	@SerializedName("authtocapperiodinday")
	private Integer authToCapPeriodInDay;
	@SerializedName("orderid")
	private String orderId;
	@SerializedName("cardccv")
	private String cardCCV;

	private PayByTokenRequest(Builder builder) throws TapPayInitialException {
		this.partnerKey = TapPay.getInstance().getApiKey();
		this.cardKey = builder.cardKey;
		this.cardToken = builder.cardToken;
		this.merchantId = builder.merchantId;
		this.amount = builder.amount;
		this.currency = builder.currency;
		this.partnerTradeId = builder.partnerTradeId;
		this.orderId = builder.orderId;
		this.instalment = builder.instalment;
		this.authToCapPeriodInDay = builder.authToCapPeriodInDay;
		this.details = builder.details;
		this.cardCCV = builder.cardCCV;
	}

	public String getCardKey() {
		return cardKey;
	}

	public void setCardKey(String cardKey) {
		this.cardKey = cardKey;
	}

	public String getCardToken() {
		return cardToken;
	}

	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
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

	public Integer getAuthToCapPeriodInDay() {
		return authToCapPeriodInDay;
	}

	public void setAuthToCapPeriodInDay(Integer authToCapPeriodInDay) {
		this.authToCapPeriodInDay = authToCapPeriodInDay;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCardCCV() {
		return cardCCV;
	}

	public void setCardCCV(String cardCCV) {
		this.cardCCV = cardCCV;
	}

	public static class Builder {

		private String cardKey;
		private String cardToken;
		private String merchantId;
		private Integer amount;
		private String currency = "TWD";
		private String partnerTradeId;
		private String details;
		private Integer instalment = 0;
		private Integer authToCapPeriodInDay = 0;
		private String orderId;
		private String cardCCV;

		/**Set cardKey for PayByTokenRequest.
		 * @param cardKey
		 *
		 */
		public Builder cardKey(String cardKey) {
			this.cardKey = cardKey;
			return this;
		}

		/**Set cardToken for PayByTokenRequest.
		 * @param cardToken
		 * 
		 */
		public Builder cardToken(String cardToken) {
			this.cardToken = cardToken;
			return this;
		}

		/**Set merchantId for PayByTokenRequest.
		 * @param merchantId
		 * 
		 */
		public Builder merchantId(String merchantId) {
			this.merchantId = merchantId;
			return this;
		}

		/**Set amount for PayByTokenRequest.
		 * @param amount
		 * 
		 */
		public Builder amount(Integer amount) {
			this.amount = amount;
			return this;
		}

		/**Set currency for PayByTokenRequest.
		 * @param currency
		 * 
		 */
		public Builder currency(String currency) {
			this.currency = currency;
			return this;
		}

		/**Set partnerTradeId for PayByTokenRequest.
		 * @param partnerTradeId
		 * 
		 */
		public Builder partnerTradeId(String partnerTradeId) {
			this.partnerTradeId = partnerTradeId;
			return this;
		}

		/**Set details for PayByTokenRequest.
		 * @param details
		 * 
		 */
		public Builder details(String details) {
			this.details = details;
			return this;
		}

		/**Set installment for PayByTokenRequest.
		 * @param instalment
		 * 
		 */
		public Builder instalment(Integer instalment) {
			this.instalment = instalment;
			return this;
		}

		/**Set authToCapPeriodInDay for PayByTokenRequest.
		 * @param authToCapPeriodInDay
		 * 
		 */
		public Builder authToCapPeriodInDay(Integer authToCapPeriodInDay) {
			this.authToCapPeriodInDay = authToCapPeriodInDay;
			return this;
		}

		/**Set orderId for PayByTokenRequest.
		 * @param orderId
		 * 
		 */
		public Builder orderId(String orderId) {
			this.orderId = orderId;
			return this;
		}

		/**Set prime for PayByTokenRequest.
		 * @param cardCCV
		 * @return
		 */
		public Builder cardCCV(String cardCCV) {
			this.cardCCV = cardCCV;
			return this;
		}

		/**Build PayByTokenRequest for sending PayByToken request.
		 * @return PayByTokenRequest
		 * @throws TapPayInitialException
		 * @throws ArgumentsValidException
		 */
		public PayByTokenRequest build() throws ArgumentsValidException, TapPayInitialException {
			if (StringUtil.isEmpty(cardKey)) {
				throw new ArgumentsValidException("Missing Arguments : cardKey");
			}
			if (StringUtil.isEmpty(cardToken)) {
				throw new ArgumentsValidException("Missing Arguments : cardToken");
			}
			if (StringUtil.isEmpty(merchantId)) {
				throw new ArgumentsValidException("Missing Arguments : MerchantId");
			}
			if (StringUtil.isEmpty(details)) {
				throw new ArgumentsValidException("Missing Arguments : details");
			}
			return new PayByTokenRequest(this);
		}

	}

	@Override
	public String toString() {
		return "PayByTokenRequest [cardKey=" + cardKey + ", cardToken=" + cardToken + ", partnerKey=" + partnerKey
				+ ", merchantId=" + merchantId + ", amount=" + amount + ", currency=" + currency + ", partnerTradeId="
				+ partnerTradeId + ", orderId=" + orderId + ", details=" + details + ", instalment=" + instalment
				+ ", authToCapPerionInDay=" + authToCapPeriodInDay + ", cardCCV=" + cardCCV + "]";
	}

}
