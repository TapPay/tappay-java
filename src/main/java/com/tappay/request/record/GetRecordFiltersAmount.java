package com.tappay.request.record;


import com.google.gson.annotations.SerializedName;

/**
 * GetRecordFiltersAmount is used to add filter of amount interval in GetRecordFilters.
 *
 */
public class GetRecordFiltersAmount {

	@SerializedName("upperlimit")
	private Integer upperLimit;
	@SerializedName("lowerlimit")
	private Integer lowerLimit;
	
	/**Create a filter containing amount interval.
	 * @param upperLimit
	 * @param lowerLimit
	 */
	public GetRecordFiltersAmount(Integer upperLimit, Integer lowerLimit){
		this.upperLimit = upperLimit;
		this.lowerLimit = lowerLimit;
	}
	
	public Integer getUpperLimit() {
		return upperLimit;
	}
	
	public void setUpperLimit(Integer upperLimit) {
		this.upperLimit = upperLimit;
	}
	
	public Integer getLowerLimit() {
		return lowerLimit;
	}
	
	public void setLowerLimit(Integer lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

}
