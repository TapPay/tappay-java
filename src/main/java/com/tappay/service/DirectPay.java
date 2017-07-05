package com.tappay.service;

import com.google.gson.Gson;
import com.tappay.exception.TapPayInitialException;
import com.tappay.exception.TapPayServerConnectException;
import com.tappay.request.direct.PayByPrimeRequest;
import com.tappay.response.direct.PayByPrimeResponse;
import com.tappay.utils.ApiRequestUtil;

public class DirectPay {

	private static final String SANDBOX_PAY_BY_PRIME_URL = "https://devgts.tappay.xyz/tpc/partner/directpay/paybyprime";
	private static final String PRODUCTION_PAY_BY_PRIME_URL = "https://prod.tappayapis.com/tpc/partner/directpay/paybyprime";

	private DirectPay() {}

	static DirectPay newInstance() {
		return new DirectPay();
	}

	public PayByPrimeResponse payByPrime(PayByPrimeRequest request)
			throws TapPayInitialException, TapPayServerConnectException {
		String responseJson = ApiRequestUtil.postJson(request.toJson(), getPayByPrimeUrl(),
				TapPay.getInstance().getApiKey());
		return new Gson().fromJson(responseJson, PayByPrimeResponse.class);
	};

	private String getPayByPrimeUrl() throws TapPayInitialException {
		switch (TapPay.getInstance().getEnvironment()) {
			case PRODUCTION:
				return PRODUCTION_PAY_BY_PRIME_URL;
			case SANDBOX:
				return SANDBOX_PAY_BY_PRIME_URL;
			default:
				throw new TapPayInitialException();
		}
	}

}
