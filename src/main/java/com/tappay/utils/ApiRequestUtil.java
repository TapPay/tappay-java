package com.tappay.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.tappay.exception.TapPayServerConnectException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class ApiRequestUtil {

	public static final long TIME_OUT_SECOND = 30;
	public static final String APPLICATION_JSON = "application/json";
	public static final String CONTENT_TYPE = "content-type";
	public static final String X_API_KEY = "x-api-key";

	public static String postJson(String json, String url, String apiKey) throws TapPayServerConnectException {
		String responseJson = "";
		OkHttpClient client = new OkHttpClient.Builder().connectTimeout(TIME_OUT_SECOND, TimeUnit.SECONDS)
				.writeTimeout(TIME_OUT_SECOND, TimeUnit.SECONDS).readTimeout(TIME_OUT_SECOND, TimeUnit.SECONDS).build();
		MediaType mediaType = MediaType.parse(APPLICATION_JSON);
		RequestBody body = RequestBody.create(mediaType, json);
		Request request = new Request.Builder().url(url).post(body).addHeader(CONTENT_TYPE, APPLICATION_JSON)
				.addHeader(X_API_KEY, apiKey).build();
		try {
			okhttp3.Response response = client.newCall(request).execute();
			responseJson = response.body().string();
		} catch (IOException e) {
			throw new TapPayServerConnectException("TapPay server connect error,please contact TapPay service.");
		}
		return responseJson;
	}
}
