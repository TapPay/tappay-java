package com.tappay.service;

import com.google.gson.Gson;
import com.tappay.exception.TapPayInitialException;
import com.tappay.exception.TapPayServerConnectException;
import com.tappay.request.record.RecordRequest;
import com.tappay.response.record.RecordResponse;
import com.tappay.utils.ApiRequestUtil;

/**
 * Record is used to send GetRecord request to TayPay.
 *
 */
public class Record {

	private static final String SANDBOX_GET_RECORD_URL = "https://sandbox.tappayapis.com/tpc/transaction/query";
	private static final String PRODUCTION_GET_RECORD_URL = "https://prod.tappayapis.com/tpc/transaction/query";

	private Record() {}

	public static Record newInstance() {
		return new Record();
	}

	/**Send GetRecord request to TapPay server.
	 * @param RecordRequest
	 * @return RecordResponse
	 * @throws TapPayServerConnectException
	 * @throws TapPayInitialException
	 */
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
