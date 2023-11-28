package io.address.verification.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;



public class VerificationResponse200DataResponse {
  @SerializedName("indexes")
  private VerificationResponse200DataResponseIndexes indexes = null;
  public VerificationResponse200DataResponse indexes(VerificationResponse200DataResponseIndexes indexes) {
    this.indexes = indexes;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public VerificationResponse200DataResponseIndexes getIndexes() {
    return indexes;
  }
  public void setIndexes(VerificationResponse200DataResponseIndexes indexes) {
    this.indexes = indexes;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationResponse200DataResponse verificationResponse200DataResponse = (VerificationResponse200DataResponse) o;
    return Objects.equals(this.indexes, verificationResponse200DataResponse.indexes);
  }
  @Override
  public int hashCode() {
    return Objects.hash(indexes);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationResponse200DataResponse {\n");
    
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
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
