package com.tappay.service;

import com.tappay.exception.TapPayInitialException;
import com.tappay.utils.StringUtil;
import com.tappay.utils.TapPayEnvironment;

/**
 * In order to use TapPay back-end SDK, the apiKey and environment must be set.
 * Otherwise, TapPayInitialException will be thrown when you access payment APIs.
 *
 */
public class TapPay {

	private String apiKey;
	private TapPayEnvironment environment;
	private static TapPay tapPay = null;

	private TapPay(String apiKey, TapPayEnvironment environment) {
		this.apiKey = apiKey;
		this.environment = environment;
	}

	private static void initialValidate() throws TapPayInitialException {
		if (tapPay == null) {
			throw new TapPayInitialException();
		}
	}

	/**Initialize SDK with apiKey and set environment.
	 * @param apiKey
	 * @param environment
	 * @throws TapPayInitialException
	 */
	public static void initial(String apiKey, TapPayEnvironment environment) throws TapPayInitialException {
		if (StringUtil.isEmpty(apiKey)) {
			throw new TapPayInitialException();
		}
		if (environment == null) {
			throw new TapPayInitialException();
		}
		if (tapPay == null) {
			synchronized (TapPay.class) {
				if (tapPay == null) {
					tapPay = new TapPay(apiKey, environment);
				}
			}
		}
	}

	public static TapPay getInstance() throws TapPayInitialException {
		initialValidate();
		return tapPay;
	}

	public String getApiKey() {
		return apiKey;
	}

	public TapPayEnvironment getEnvironment() {
		return environment;
	}

	/**Obtain a DirectPay object for sending PayByPrime or PayByToken request. 
	 * @return DirectPay
	 * @throws TapPayInitialException
	 */
	public static DirectPay createDirectPay() throws TapPayInitialException {
		initialValidate();
		return DirectPay.newInstance();
	}

	/**Obtain a Refund object for sending Refund request. 
	 * @return Refund
	 * @throws TapPayInitialException
	 */
	public static Refund createRefund() throws TapPayInitialException {
		initialValidate();
		return Refund.newInstance();
	}
	
	/**Obtain a Record object for sending GetRecord request. 
	 * @return Record
	 * @throws TapPayInitialException
	 */
	public static Record createGetRecord() throws TapPayInitialException {
		initialValidate();
		return Record.newInstance();
	}

}
