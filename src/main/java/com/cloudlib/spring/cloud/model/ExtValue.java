package com.cloudlib.spring.cloud.model;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * ExtValue
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-07T13:57:55.449-08:00")

public class ExtValue  implements Serializable {
  private String extValue = null;

  public ExtValue extValue(String extValue) {
    this.extValue = extValue;
    return this;
  }

   /**
   * Get extValue
   * @return extValue
  **/
  @ApiModelProperty(value = "")
  public String getExtValue() {
    return extValue;
  }

  public void setExtValue(String extValue) {
    this.extValue = extValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtValue extValue = (ExtValue) o;
    return Objects.equals(this.extValue, extValue.extValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtValue {\n");
    
    sb.append("    extValue: ").append(toIndentedString(extValue)).append("\n");
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

