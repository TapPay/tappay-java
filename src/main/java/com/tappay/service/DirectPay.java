package com.tappay.service;

import com.google.gson.Gson;
import com.tappay.exception.TapPayInitialException;
import com.tappay.exception.TapPayServerConnectException;
import com.tappay.request.direct.PayByPrimeRequest;
import com.tappay.request.direct.PayByTokenRequest;
import com.tappay.response.direct.PayByPrimeResponse;
import com.tappay.response.direct.PayByTokenResponse;
import com.tappay.utils.ApiRequestUtil;

public class DirectPay {

	private static final String SANDBOX_PAY_BY_PRIME_URL = "https://sandbox.tappayapis.com/tpc/partner/directpay/paybyprime";
	private static final String PRODUCTION_PAY_BY_PRIME_URL = "https://prod.tappayapis.com/tpc/partner/directpay/paybyprime";

	private static final String SANDBOX_PAY_BY_TOKEN_URL = "https://sandbox.tappayapis.com/tpc/partner/directpay/paybytoken";
	private static final String PRODUCTION_PAY_BY_TOKEN_URL = "https://prod.tappayapis.com/tpc/partner/directpay/paybytoken";

	private DirectPay() {}

	static DirectPay newInstance() {
		return new DirectPay();
	}

	public PayByPrimeResponse payByPrime(PayByPrimeRequest request)
			throws TapPayInitialException, TapPayServerConnectException {
		String responseJson = ApiRequestUtil.postJson(request.toJson(), getPayByPrimeUrl(),
				TapPay.getInstance().getApiKey());
		return new Gson().fromJson(responseJson, PayByPrimeResponse.class);
	}

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

	public PayByTokenResponse payByToken(PayByTokenRequest request)
			throws TapPayInitialException, TapPayServerConnectException {
		String responseJson = ApiRequestUtil.postJson(request.toJson(), getPayByTokenUrl(),
				TapPay.getInstance().getApiKey());
		return new Gson().fromJson(responseJson, PayByTokenResponse.class);
	}

	private String getPayByTokenUrl() throws TapPayInitialException {
		switch (TapPay.getInstance().getEnvironment()) {
			case PRODUCTION:
				return PRODUCTION_PAY_BY_TOKEN_URL;
			case SANDBOX:
				return SANDBOX_PAY_BY_TOKEN_URL;
			default:
				throw new TapPayInitialException();
		}
	}

}
