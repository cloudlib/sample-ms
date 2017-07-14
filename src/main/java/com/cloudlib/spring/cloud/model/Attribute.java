package com.cloudlib.spring.cloud.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


/**
 * Attribute
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-07T13:57:55.449-08:00")

public class Attribute implements Serializable  {
  private List<ExtValue> extendedValue = new ArrayList<ExtValue>();

  private List<Values> values = new ArrayList<Values>();

  private String description = null;

  private String identifier = null;

  private String name = null;

  public Attribute extendedValue(List<ExtValue> extendedValue) {
    this.extendedValue = extendedValue;
    return this;
  }

  public Attribute addExtendedValueItem(ExtValue extendedValueItem) {
    this.extendedValue.add(extendedValueItem);
    return this;
  }

   /**
   * Get extendedValue
   * @return extendedValue
  **/
  @ApiModelProperty(value = "")
  public List<ExtValue> getExtendedValue() {
    return extendedValue;
  }

  public void setExtendedValue(List<ExtValue> extendedValue) {
    this.extendedValue = extendedValue;
  }

  public Attribute values(List<Values> values) {
    this.values = values;
    return this;
  }

  public Attribute addValuesItem(Values valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
  public List<Values> getValues() {
    return values;
  }

  public void setValues(List<Values> values) {
    this.values = values;
  }

  public Attribute description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Attribute identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Attribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.extendedValue, attribute.extendedValue) &&
        Objects.equals(this.values, attribute.values) &&
        Objects.equals(this.description, attribute.description) &&
        Objects.equals(this.identifier, attribute.identifier) &&
        Objects.equals(this.name, attribute.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendedValue, values, description, identifier, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attribute {\n");
    
    sb.append("    extendedValue: ").append(toIndentedString(extendedValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

