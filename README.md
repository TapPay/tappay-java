# Deprecated - 20200824 updated

This module is not longer maintained, please do not use this module.

# TapPay Java Library
You can sign up for TapPay account at [https://www.tappaysdk.com](https://www.tappaysdk.com)
## Requirements
Java 1.7 or later.
## Direct Pay By Prime Usage
```java
import com.tappay.exception.ArgumentsValidException;
import com.tappay.exception.TapPayInitialException;
import com.tappay.exception.TapPayServerConnectException;
import com.tappay.request.Cardholder;
import com.tappay.request.direct.PayByPrimeRequest;
import com.tappay.response.direct.PayByPrimeResponse;
import com.tappay.utils.TapPayEnvironment;

public class DirectPayByPrimeExample {

	public static void main(String[] args)
			throws TapPayInitialException, ArgumentsValidException, TapPayServerConnectException {
		TapPay.initial("Your partner key", TapPayEnvironment.SANDBOX);
		Cardholder cardholder = new Cardholder.Builder().email("support@cherri.tech").name("tappay").phoneNumber("").build();
		PayByPrimeRequest request = new PayByPrimeRequest.Builder().amount(1).authToCapPerionInDay(0).currency("TWD")
				.instalment(0).details("Item Details").merchantId("Your Merchant Id").remember(true).cardholder(cardholder)
				.prime("From get prime api").build();
		PayByPrimeResponse response = TapPay.createDirectPay().payByPrime(request);
		System.out.println(response);
	}
}
```

## Direct Pay By Token Usage
```java
import com.tappay.exception.ArgumentsValidException;
import com.tappay.exception.TapPayInitialException;
import com.tappay.exception.TapPayServerConnectException;
import com.tappay.request.direct.PayByTokenRequest;
import com.tappay.response.direct.PayByTokenResponse;
import com.tappay.service.TapPay;
import com.tappay.utils.TapPayEnvironment;

public class DirectPayByTokenExample {

	public static void main(String[] args)
			throws TapPayInitialException, ArgumentsValidException, TapPayServerConnectException {
		TapPay.initial("Your partner key", TapPayEnvironment.SANDBOX);
		PayByTokenRequest payByTokenRequest = new PayByTokenRequest.Builder().cardKey("Your card key")
				.cardToken("Your card token").merchantId("Your Merchant Id").amount(1).currency("TWD").instalment(0)
				.details("Item Details").authToCapPeriodInDay(0).build();
		PayByTokenResponse response = TapPay.createDirectPay().payByToken(payByTokenRequest);
		System.out.println(response);
	}
}
```

## Refund Usage
```java
import com.tappay.exception.ArgumentsValidException;
import com.tappay.exception.TapPayInitialException;
import com.tappay.exception.TapPayServerConnectException;
import com.tappay.request.refund.RefundRequest;
import com.tappay.response.refund.RefundResponse;
import com.tappay.service.TapPay;
import com.tappay.utils.TapPayEnvironment;

public class RefundExample {

	public static void main(String[] args)
			throws TapPayInitialException, ArgumentsValidException, TapPayServerConnectException {
		TapPay.initial("Your partner key", TapPayEnvironment.SANDBOX);
		RefundRequest refundRequest = new RefundRequest.Builder().recordId("Record Id").build();
		RefundResponse response = TapPay.createRefund().refund(refundRequest);
		System.out.println(response);
	}
}
```

## GetRecord Usage
```java
import com.tappay.exception.ArgumentsValidException;
import com.tappay.exception.TapPayInitialException;
import com.tappay.exception.TapPayServerConnectException;
import com.tappay.request.record.GetRecordFilters;
import com.tappay.request.record.GetRecordFiltersAmount;
import com.tappay.request.record.GetRecordFiltersPaymentType;
import com.tappay.request.record.GetRecordFiltersTime;
import com.tappay.request.record.GetRecordOrderBy;
import com.tappay.request.record.RecordRequest;
import com.tappay.request.record.GetRecordFilters.RecordStatus;
import com.tappay.request.record.GetRecordOrderBy.OrderByAttributes;
import com.tappay.response.record.RecordResponse;
import com.tappay.service.TapPay;
import com.tappay.utils.TapPayEnvironment;

public class GetRecordExample {

	public static void main(String[] args)
			throws TapPayInitialException, ArgumentsValidException, TapPayServerConnectException {
		TapPay.initial("Your partner key", TapPayEnvironment.SANDBOX);

		GetRecordFiltersTime getRecordFiltersTime = new GetRecordFiltersTime(1501056435000L, 1501142835000L);

		GetRecordFiltersAmount getRecordFiltersAmount = new GetRecordFiltersAmount(10, 0);

		GetRecordFiltersPaymentType getRecordFiltersPaymentType = new GetRecordFiltersPaymentType.Builder().directPay()
				.build();

		GetRecordFilters getRecordFilters = new GetRecordFilters.Builder().time(getRecordFiltersTime)
				.amount(getRecordFiltersAmount).paymentType(getRecordFiltersPaymentType).recordStatus(RecordStatus.AUTH)
				.recTradeId("recTradeId").build();

		GetRecordOrderBy getRecordRequestOrderBy = new GetRecordOrderBy(OrderByAttributes.amount, true);

		RecordRequest recordRequest = new RecordRequest.Builder().filters(getRecordFilters).recordsPerPage(20).page(0)
				.orderBy(getRecordRequestOrderBy).build();
		RecordResponse response = TapPay.createGetRecord().getRecord(recordRequest);
		System.out.println(response);
	}
}

```

