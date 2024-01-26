package io.address.verification.client.model;


import com.google.gson.annotations.SerializedName;

public class ResponseVerification {
	
	@SerializedName("dateTime")
	private String dateTime = null;
	
	@SerializedName("operation")
	private String operation = null;
	
	@SerializedName("message")
	private String message = null;
	
	@SerializedName("subscriptionId")
	private String subscriptionId = null;
	
	@SerializedName("requestId")
	private String requestId = null;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
	    sb.append("class ResponseVerification {\n");
	    
	    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
	    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
	    sb.append("    message: ").append(toIndentedString(message)).append("\n");
	    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
	    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
