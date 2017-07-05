# tappay-java
## PayByPrime Usage
TapPay.initial("Your Partner Key", TapPayEnvironment.SANDBOX);
Cardholder cardholder = new Cardholder.Builder().email("email").name("name").phoneNumber("phone").zipCode("").nationalId("").address("").build();
PayByPrimeRequest request = new PayByPrimeRequest.Builder().amount(1).authToCapPerionInDay(0).currency("TWD")
.instalment(0).details("Details").merchantId("Merchant Id").remember(true).cardholder(cardholder)
.prime("Prime from get prime api").build();
PayByPrimeResponse response = TapPay.createDirectPay().payByPrime(request);
System.out.println(response);
