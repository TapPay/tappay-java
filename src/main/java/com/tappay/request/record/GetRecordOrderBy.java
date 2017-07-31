package com.tappay.request.record;

import com.google.gson.annotations.SerializedName;

public class GetRecordOrderBy {

	public enum OrderByAttributes {
		time, amount
	}

	@SerializedName("attribute")
	private String attribute;
	@SerializedName("isdescending")
	private Boolean isDescending;

	public GetRecordOrderBy(OrderByAttributes attr, boolean isDescending) {
		this.attribute = attr.name();
		this.isDescending = isDescending;
	}

}
