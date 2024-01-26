package io.address.verification.client.model;

import com.google.gson.annotations.SerializedName;


import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

public class VerificationResponse200 {
	@SerializedName("code")
	private BigDecimal code = null;
	@SerializedName("message")
	private String message = null;
	@SerializedName("dateTime")
	private OffsetDateTime dateTime = null;
	@SerializedName("data")
	private VerificationResponse200Data data = null;
	@SerializedName("response")
	private VerificationResponse200DataResponse response = null;

	public VerificationResponse200DataResponse getResponse() {
		return response;
	}

	public void setResponse(VerificationResponse200DataResponse response) {
		this.response = response;
	}

	public BigDecimal getCode() {
		return code;
	}

	public void setCode(BigDecimal code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public OffsetDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(OffsetDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public VerificationResponse200Data getData() {
		return data;
	}

	public void setData(VerificationResponse200Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VerificationResponse200 {\n");

		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("    response: ").append(toIndentedString(response)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
