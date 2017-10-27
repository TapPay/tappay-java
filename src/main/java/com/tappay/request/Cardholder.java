package com.tappay.request;

import com.google.gson.annotations.SerializedName;
import com.tappay.exception.ArgumentsValidException;
import com.tappay.utils.StringUtil;

/**
 * CardHolder contains card holder's information. PhoneNumber, Name and Email are mandatory for PayByPrime and PayByToken API.
 *
 */
public class Cardholder {

	@SerializedName("phone_number")
	private String phoneNumber;
	private String name;
	private String email;
	@SerializedName("zip_code")
	private String zipCode;
	@SerializedName("address")
	private String address;
	@SerializedName("national_id")
	private String nationalId;

	public Cardholder(Builder builder) {
		this.phoneNumber = builder.phoneNumber;
		this.name = builder.name;
		this.email = builder.email;
		this.zipCode = builder.zipCode;
		this.address = builder.address;
		this.nationalId = builder.nationalId;
	}

	public static class Builder {

		private String phoneNumber;
		private String name;
		private String email;
		private String zipCode = "";
		private String address = "";
		private String nationalId = "";

		public Cardholder build() throws ArgumentsValidException {
			if (StringUtil.isEmpty(phoneNumber)) {
				throw new ArgumentsValidException("Missing Arguments : Cardholder > PhoneNumber");
			}
			if (StringUtil.isEmpty(name)) {
				throw new ArgumentsValidException("Missing Arguments : Cardholder > Name");
			}
			if (StringUtil.isEmpty(email)) {
				throw new ArgumentsValidException("Missing Arguments : Cardholder > Email");
			}
			return new Cardholder(this);
		}

		/**Set phoneNumber for CardHolder.
		 * @param phoneNumber
		 *
		 */
		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		/**Set name for CardHolder.
		 * @param name
		 * 
		 */
		public Builder name(String name) {
			this.name = name;
			return this;
		}

		/**Set email for CardHolder.
		 * @param email
		 *
		 */
		public Builder email(String email) {
			this.email = email;
			return this;
		}

		/**Set zipCode for CardHolder.
		 * @param zipCode
		 * 
		 */
		public Builder zipCode(String zipCode) {
			this.zipCode = zipCode;
			return this;
		}

		/**Set address for CardHolder.
		 * @param address
		 * 
		 */
		public Builder address(String address) {
			this.address = address;
			return this;
		}

		/**Set nationalId for CardHolder.
		 * @param nationalId
		 * 
		 */
		public Builder nationalId(String nationalId) {
			this.nationalId = nationalId;
			return this;
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	@Override
	public String toString() {
		return "Cardholder [phoneNumber=" + phoneNumber + ", name=" + name + ", email=" + email + ", zipCode=" + zipCode
				+ ", address=" + address + ", nationalId=" + nationalId + "]";
	}

}
