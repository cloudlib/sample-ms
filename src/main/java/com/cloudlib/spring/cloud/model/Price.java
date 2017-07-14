package com.cloudlib.spring.cloud.model;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Price
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-07T13:57:55.449-08:00")

public class Price implements Serializable  {
  private String priceDescription = null;

  private String priceUsage = null;

  private String priceValue = null;

  public Price priceDescription(String priceDescription) {
    this.priceDescription = priceDescription;
    return this;
  }

   /**
   * Get priceDescription
   * @return priceDescription
  **/
  @ApiModelProperty(value = "")
  public String getPriceDescription() {
    return priceDescription;
  }

  public void setPriceDescription(String priceDescription) {
    this.priceDescription = priceDescription;
  }

  public Price priceUsage(String priceUsage) {
    this.priceUsage = priceUsage;
    return this;
  }

   /**
   * Get priceUsage
   * @return priceUsage
  **/
  @ApiModelProperty(value = "")
  public String getPriceUsage() {
    return priceUsage;
  }

  public void setPriceUsage(String priceUsage) {
    this.priceUsage = priceUsage;
  }

  public Price priceValue(String priceValue) {
    this.priceValue = priceValue;
    return this;
  }

   /**
   * Get priceValue
   * @return priceValue
  **/
  @ApiModelProperty(value = "")
  public String getPriceValue() {
    return priceValue;
  }

  public void setPriceValue(String priceValue) {
    this.priceValue = priceValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.priceDescription, price.priceDescription) &&
        Objects.equals(this.priceUsage, price.priceUsage) &&
        Objects.equals(this.priceValue, price.priceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceDescription, priceUsage, priceValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    priceDescription: ").append(toIndentedString(priceDescription)).append("\n");
    sb.append("    priceUsage: ").append(toIndentedString(priceUsage)).append("\n");
    sb.append("    priceValue: ").append(toIndentedString(priceValue)).append("\n");
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

