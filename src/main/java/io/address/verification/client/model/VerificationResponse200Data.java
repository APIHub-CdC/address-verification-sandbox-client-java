package io.address.verification.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;



public class VerificationResponse200Data {
  @SerializedName("request")
  private VerificationRequest request = null;
  @SerializedName("response")
  private VerificationResponse200DataResponse response = null;
  public VerificationResponse200Data request(VerificationRequest request) {
    this.request = request;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public VerificationRequest getRequest() {
    return request;
  }
  public void setRequest(VerificationRequest request) {
    this.request = request;
  }
  public VerificationResponse200Data response(VerificationResponse200DataResponse response) {
    this.response = response;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public VerificationResponse200DataResponse getResponse() {
    return response;
  }
  public void setResponse(VerificationResponse200DataResponse response) {
    this.response = response;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationResponse200Data verificationResponse200Data = (VerificationResponse200Data) o;
    return Objects.equals(this.request, verificationResponse200Data.request) &&
        Objects.equals(this.response, verificationResponse200Data.response);
  }
  @Override
  public int hashCode() {
    return Objects.hash(request, response);
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
