package com.cloudlib.spring.cloud.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * InvalidParameters
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-07T13:57:55.449-08:00")

public class InvalidParameters   {
  private String errorCode = null;

  private String errorDescription = null;

  private String errorCategory = null;

  public InvalidParameters errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public InvalidParameters errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @ApiModelProperty(value = "")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public InvalidParameters errorCategory(String errorCategory) {
    this.errorCategory = errorCategory;
    return this;
  }

   /**
   * Get errorCategory
   * @return errorCategory
  **/
  @ApiModelProperty(value = "")
  public String getErrorCategory() {
    return errorCategory;
  }

  public void setErrorCategory(String errorCategory) {
    this.errorCategory = errorCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidParameters invalidParameters = (InvalidParameters) o;
    return Objects.equals(this.errorCode, invalidParameters.errorCode) &&
        Objects.equals(this.errorDescription, invalidParameters.errorDescription) &&
        Objects.equals(this.errorCategory, invalidParameters.errorCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorDescription, errorCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidParameters {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorCategory: ").append(toIndentedString(errorCategory)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

