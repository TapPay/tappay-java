package com.tappay.request.record;

import com.google.gson.annotations.SerializedName;
import com.tappay.exception.ArgumentsValidException;
import com.tappay.exception.TapPayInitialException;
import com.tappay.request.TapPayRequest;
import com.tappay.service.TapPay;

/**
 * RecordRequest is employed to send a GetRecord request.
 *
 */
public class RecordRequest extends TapPayRequest {

	@SerializedName("partner_key")
	private String partnerKey;
	@SerializedName("records_per_page")
	private Integer recordsPerPage;
	private Integer page;
	private GetRecordFilters filters;
	@SerializedName("order_by")
	private GetRecordOrderBy orderBy;

	private RecordRequest(Builder builder) throws TapPayInitialException {
		this.partnerKey = TapPay.getInstance().getApiKey();
		this.recordsPerPage = builder.recordsPerPage;
		this.page = builder.page;
		this.filters = builder.filters;
		this.orderBy = builder.orderBy;
	}

	public String getPartnerKey() {
		return partnerKey;
	}

	public void setPartnerKey(String partnerKey) {
		this.partnerKey = partnerKey;
	}

	public Integer getRecordsPerPage() {
		return recordsPerPage;
	}

	public void setRecordsPerPage(Integer recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public GetRecordFilters getFilters() {
		return filters;
	}

	public void setFilters(GetRecordFilters filters) {
		this.filters = filters;
	}

	public GetRecordOrderBy getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(GetRecordOrderBy orderBy) {
		this.orderBy = orderBy;
	}

	public static class Builder {

		Integer recordsPerPage = 50;
		Integer page = 0;
		GetRecordFilters filters;
		GetRecordOrderBy orderBy;

		/**Set recordsPerPage for RecordRequest.
		 * @param recordsPerPage
		 * 
		 */
		public Builder recordsPerPage(Integer recordsPerPage) {
			this.recordsPerPage = recordsPerPage;
			return this;
		}

		/**Set page for RecordRequest.
		 * @param page
		 * 
		 */
		public Builder page(Integer page) {
			this.page = page;
			return this;
		}

		/**Set GetRecordFilters for RecordRequest.
		 * @param GetRecordFilters
		 * 
		 */
		public Builder filters(GetRecordFilters filters) {
			this.filters = filters;
			return this;
		}

		/**Set GetRecordOrderBy for RecordRequest.
		 * @param GetRecordOrderBy
		 * 
		 */
		public Builder orderBy(GetRecordOrderBy orderBy) {
			this.orderBy = orderBy;
			return this;
		}

		/**Build RecordRequest for sending GetRecord request.
		 * @return RecordRequest
		 * @throws TapPayInitialException
		 * @throws ArgumentsValidException
		 */
		public RecordRequest build() throws TapPayInitialException, ArgumentsValidException {
			if (filters != null) {
				if (filters.getAmount() != null
						&& (filters.getAmount().getLowerLimit() > filters.getAmount().getUpperLimit())) {
					throw new ArgumentsValidException("filters > amount > lowerlimit can't more than the upperlimit");
				}

				if (filters.getTime() != null
						&& (filters.getTime().getStartTime() > filters.getTime().getEndTimeMillis())) {
					throw new ArgumentsValidException("filters > time > starttime can't more than the endtime");
				}
			}
			
			if (page < 0) {
				throw new ArgumentsValidException("page out of range");
			}
			
			return new RecordRequest(this);
		}

	}

	@Override
	public String toString() {
		return "RecordRequest [partnerKey=" + partnerKey + ", recordsPerPage=" + recordsPerPage + ", page=" + page
				+ ", filters=" + filters + ", orderBy=" + orderBy + "]";
	}

}
