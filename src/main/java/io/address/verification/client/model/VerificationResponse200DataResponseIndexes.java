package io.address.verification.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


public class VerificationResponse200DataResponseIndexes {
  @SerializedName("certaintyIndex")
  private BigDecimal certaintyIndex = null;
  @SerializedName("coincidenceIndex")
  private BigDecimal coincidenceIndex = null;
  public VerificationResponse200DataResponseIndexes certaintyIndex(BigDecimal certaintyIndex) {
    this.certaintyIndex = certaintyIndex;
    return this;
  }
   
  @ApiModelProperty(example = "0.6", value = "")
  public BigDecimal getCertaintyIndex() {
    return certaintyIndex;
  }
  public void setCertaintyIndex(BigDecimal certaintyIndex) {
    this.certaintyIndex = certaintyIndex;
  }
  public VerificationResponse200DataResponseIndexes coincidenceIndex(BigDecimal coincidenceIndex) {
    this.coincidenceIndex = coincidenceIndex;
    return this;
  }
   
  @ApiModelProperty(example = "0.5", value = "")
  public BigDecimal getCoincidenceIndex() {
    return coincidenceIndex;
  }
  public void setCoincidenceIndex(BigDecimal coincidenceIndex) {
    this.coincidenceIndex = coincidenceIndex;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationResponse200DataResponseIndexes verificationResponse200DataResponseIndexes = (VerificationResponse200DataResponseIndexes) o;
    return Objects.equals(this.certaintyIndex, verificationResponse200DataResponseIndexes.certaintyIndex) &&
        Objects.equals(this.coincidenceIndex, verificationResponse200DataResponseIndexes.coincidenceIndex);
  }
  @Override
  public int hashCode() {
    return Objects.hash(certaintyIndex, coincidenceIndex);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationResponse200DataResponseIndexes {\n");
    
    sb.append("    certaintyIndex: ").append(toIndentedString(certaintyIndex)).append("\n");
    sb.append("    coincidenceIndex: ").append(toIndentedString(coincidenceIndex)).append("\n");
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
