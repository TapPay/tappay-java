package com.tappay.service;

import com.google.gson.Gson;
import com.tappay.exception.TapPayInitialException;
import com.tappay.exception.TapPayServerConnectException;
import com.tappay.request.cap.CapRequest;
import com.tappay.response.cap.CapResponse;
import com.tappay.utils.ApiRequestUtil;

public class Cap {

	private static final String SANDBOX_CAP_URL = "https://sandbox.tappayapis.com/tpc/transaction/cap";
	private static final String PRODUCTION_CAP_URL = "https://prod.tappayapis.com/tpc/transaction/cap";

	private Cap() {}

	public static Cap newInstance() {
		return new Cap();
	}

	/**
	 * Send Refund request to TapPay server.
	 * 
	 * @param RefundRequest
	 * @return RefundResponse
	 * @throws TapPayServerConnectException
	 * @throws TapPayInitialException
	 */
	public CapResponse refund(CapRequest request) throws TapPayServerConnectException, TapPayInitialException {
		String responseJson = ApiRequestUtil.postJson(request.toJson(), getCapUrl(), TapPay.getInstance().getApiKey());
		return new Gson().fromJson(responseJson, CapResponse.class);
	}

	private String getCapUrl() throws TapPayInitialException {
		switch (TapPay.getInstance().getEnvironment()) {
			case PRODUCTION:
				return PRODUCTION_CAP_URL;
			case SANDBOX:
				return SANDBOX_CAP_URL;
			default:
				throw new TapPayInitialException();
		}
	}
}
