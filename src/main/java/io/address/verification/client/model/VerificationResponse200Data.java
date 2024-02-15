package io.address.verification.client.model;

import com.google.gson.annotations.SerializedName;



public class VerificationResponse200Data {
	@SerializedName("request")
	private VerificationRequest request = null;
	
	@SerializedName("response")
	private Response response = null;
	

	public VerificationRequest getRequest() {
		return request;
	}

	public void setRequest(VerificationRequest request) {
		this.request = request;
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VerificationResponse200Data {\n");

		sb.append("    request: ").append(toIndentedString(request)).append("\n");
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
