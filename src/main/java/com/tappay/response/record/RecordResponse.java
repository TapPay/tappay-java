package com.tappay.response.record;

import java.util.ArrayList;
import com.google.gson.annotations.SerializedName;
import com.tappay.response.TapPayResponse;

public class RecordResponse extends TapPayResponse {

	@SerializedName("recordsperpage")
	private Integer recordsPerPage;
	private Integer page;
	@SerializedName("totalpagecount")
	private Integer totalPageCount;
	@SerializedName("numberoftransactions")
	private Long numberOfTransactions;
	@SerializedName("traderecords")
	private ArrayList<TradeRecords> tradeRecords;

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

	public Integer getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(Integer totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public Long getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(Long numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

	public ArrayList<TradeRecords> getTradeRecords() {
		return tradeRecords;
	}

	public void setTradeRecords(ArrayList<TradeRecords> tradeRecords) {
		this.tradeRecords = tradeRecords;
	}

	@Override
	public String toString() {
		return "RecordResponse [status=" + status + ", message=" + message + ", recordsPerPage=" + recordsPerPage
				+ ", page=" + page + ", totalPageCount=" + totalPageCount + ", numberOfTransactions="
				+ numberOfTransactions + ", tradeRecords=" + tradeRecords + "]";
	}

}
