package com.tappay.request.record;

import com.google.gson.annotations.SerializedName;

/**
 * GetRecordFiltersTime is used to add filter of time interval in GetRecordFilters.
 *
 */
public class GetRecordFiltersTime {

	@SerializedName("starttime")
	private Long startTimeMillis;
	@SerializedName("endtime")
	private Long endTimeMillis;

	/**Create a filter containing time interval.
	 * @param startTimeMillis
	 * @param endTimeMillis
	 */
	public GetRecordFiltersTime(Long startTimeMillis, Long endTimeMillis) {
		this.startTimeMillis = startTimeMillis;
		this.endTimeMillis = endTimeMillis;
	}

	public Long getStartTime() {
		return startTimeMillis;
	}

	public void setStartTimeMillis(Long startTimeMillis) {
		this.startTimeMillis = startTimeMillis;
	}

	public Long getEndTimeMillis() {
		return endTimeMillis;
	}

	public void setEndTime(Long endTimeMillis) {
		this.endTimeMillis = endTimeMillis;
	}

}
