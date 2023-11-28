package io.address.verification.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

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
  public VerificationResponse200 code(BigDecimal code) {
    this.code = code;
    return this;
  }
   
  @ApiModelProperty(example = "200.0", value = "")
  public BigDecimal getCode() {
    return code;
  }
  public void setCode(BigDecimal code) {
    this.code = code;
  }
  public VerificationResponse200 message(String message) {
    this.message = message;
    return this;
  }
   
  @ApiModelProperty(example = "The request has been completed successfully", value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
   
  @ApiModelProperty(example = "2020-04-12T22:20:50.52Z", value = "Date and time of the acknowledge. As defined by date-time - RFC3339.")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }
  public VerificationResponse200 data(VerificationResponse200Data data) {
    this.data = data;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public VerificationResponse200Data getData() {
    return data;
  }
  public void setData(VerificationResponse200Data data) {
    this.data = data;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationResponse200 verificationResponse200 = (VerificationResponse200) o;
    return Objects.equals(this.code, verificationResponse200.code) &&
        Objects.equals(this.message, verificationResponse200.message) &&
        Objects.equals(this.dateTime, verificationResponse200.dateTime) &&
        Objects.equals(this.data, verificationResponse200.data);
  }
  @Override
  public int hashCode() {
    return Objects.hash(code, message, dateTime, data);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationResponse200 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
