package com.cloudlib.spring.cloud.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudlib.spring.cloud.model.CatalogEntryView;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




/**
 * ProductDetail
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-07T13:57:55.449-08:00")

public class ProductDetail implements Serializable{
	
  @JsonProperty("CatalogEntryView")		
  private List<CatalogEntryView> catalogEntryView = new ArrayList<CatalogEntryView>();

  @JsonProperty("resourceName")	
  private String resourceName = null;

  public ProductDetail catalogEntryView(List<CatalogEntryView> catalogEntryView) {
    this.catalogEntryView = catalogEntryView;
    return this;
  }

  public ProductDetail addCatalogEntryViewItem(CatalogEntryView catalogEntryViewItem) {
    this.catalogEntryView.add(catalogEntryViewItem);
    return this;
  }

   /**
   * Get catalogEntryView
   * @return catalogEntryView
  **/
  @ApiModelProperty(value = "")
  public List<CatalogEntryView> getCatalogEntryView() {
    return catalogEntryView;
  }

  public void setCatalogEntryView(List<CatalogEntryView> catalogEntryView) {
    this.catalogEntryView = catalogEntryView;
  }

  public ProductDetail resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @ApiModelProperty(value = "")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetail productDetail = (ProductDetail) o;
    return Objects.equals(this.catalogEntryView, productDetail.catalogEntryView) &&
        Objects.equals(this.resourceName, productDetail.resourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogEntryView, resourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetail {\n");
    
    sb.append("    catalogEntryView: ").append(toIndentedString(catalogEntryView)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

