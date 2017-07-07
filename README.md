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
