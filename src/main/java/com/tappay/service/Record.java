package com.tappay.service;

import com.google.gson.Gson;
import com.tappay.exception.TapPayInitialException;
import com.tappay.exception.TapPayServerConnectException;
import com.tappay.request.record.RecordRequest;
import com.tappay.response.record.RecordResponse;
import com.tappay.utils.ApiRequestUtil;

public class Record {

	private static final String SANDBOX_GET_RECORD_URL = "https://sandbox.tappayapis.com/tpc/partner/getrecordsplus";
	private static final String PRODUCTION_GET_RECORD_URL = "https://prod.tappayapis.com/tpc/partner/getrecordsplus";

	private Record() {}

	public static Record newInstance() {
		return new Record();
	}

	public RecordResponse getRecord(RecordRequest request) throws TapPayServerConnectException, TapPayInitialException {
		String responseJson = ApiRequestUtil.postJson(request.toJson(), getRecordUrl(),
				TapPay.getInstance().getApiKey());
		return new Gson().fromJson(responseJson, RecordResponse.class);
	}

	private String getRecordUrl() throws TapPayInitialException {
		switch (TapPay.getInstance().getEnvironment()) {
			case PRODUCTION:
				return PRODUCTION_GET_RECORD_URL;
			case SANDBOX:
				return SANDBOX_GET_RECORD_URL;
			default:
				throw new TapPayInitialException();
		}
	}
}
