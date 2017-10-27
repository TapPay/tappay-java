package com.tappay.request.cap;

import com.google.gson.annotations.SerializedName;
import com.tappay.exception.ArgumentsValidException;
import com.tappay.request.TapPayRequest;
import com.tappay.utils.StringUtil;

public class CapRequest extends TapPayRequest {

	@SerializedName("partner_key")
	String partnerKey;
	@SerializedName("rec_trade_id")
	String recTradeId;

	public static class Builder {

		private String partnerKey;
		private String recTradeId;

		public Builder partnerKey(String partnerKey) {
			this.partnerKey = partnerKey;
			return this;
		}

		public Builder recTradeId(String recTradeId) {
			this.recTradeId = recTradeId;
			return this;
		}

		public CapRequest build() throws ArgumentsValidException {
			if (StringUtil.isEmpty(partnerKey)) {
				throw new ArgumentsValidException("Miss Arguments : partnerKey");
			}
			if (StringUtil.isEmpty(recTradeId)) {
				throw new ArgumentsValidException("Miss Arguments : recTradeId");
			}
			return new CapRequest(this);
		}
	}

	public CapRequest(Builder builder) {
		this.partnerKey = builder.partnerKey;
		this.recTradeId = builder.recTradeId;
	}

	public String getPartnerKey() {
		return partnerKey;
	}

	public void setPartnerKey(String partnerKey) {
		this.partnerKey = partnerKey;
	}

	public String getRecTradeId() {
		return recTradeId;
	}

	public void setRecTradeId(String recTradeId) {
		this.recTradeId = recTradeId;
	}

	@Override
	public String toString() {
		return "CapRequest [partnerKey=" + partnerKey + ", recTradeId=" + recTradeId + "]";
	}
}
