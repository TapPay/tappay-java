package com.tappay.request.refund;

import com.google.gson.annotations.SerializedName;
import com.tappay.exception.ArgumentsValidException;
import com.tappay.exception.TapPayInitialException;
import com.tappay.request.TapPayRequest;
import com.tappay.service.TapPay;
import com.tappay.utils.StringUtil;


/**
 * RefundRequest is employed to send a Refund request.
 *
 */
public class RefundRequest extends TapPayRequest {

	@SerializedName("partnerkey")
	private String partnerKey;
	@SerializedName("rectradeid")
	private String recordId;

	private RefundRequest(Builder builder) throws TapPayInitialException {
		this.partnerKey = TapPay.getInstance().getApiKey();
		this.recordId = builder.recordId;
	}

	public static class Builder {

		private String recordId;

		/**Build RefundRequest for sending Refund request.
		 * @return RefundRequest
		 * @throws TapPayInitialException
		 * @throws ArgumentsValidException
		 */
		public RefundRequest build() throws TapPayInitialException, ArgumentsValidException {
			if (StringUtil.isEmpty(recordId)) {
				throw new ArgumentsValidException("Miss Arguments : recordId");
			}
			return new RefundRequest(this);
		}

		/**Set recordId for RefundRequest.
		 * @param recordId
		 * 
		 */
		public Builder recordId(String recordId) {
			this.recordId = recordId;
			return this;
		}
	}

	public String getPartnerKey() {
		return partnerKey;
	}

	public void setPartnerKey(String partnerKey) {
		this.partnerKey = partnerKey;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	@Override
	public String toString() {
		return "RefundRequest [partnerKey=" + partnerKey + ", recordId=" + recordId + "]";
	}

}
