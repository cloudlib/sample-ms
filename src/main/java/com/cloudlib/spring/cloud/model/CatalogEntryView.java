package com.cloudlib.spring.cloud.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudlib.spring.cloud.model.Attribute;
import com.cloudlib.spring.cloud.model.Price;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




/**
 * CatalogEntryView
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-07T13:57:55.449-08:00")

public class CatalogEntryView implements Serializable  {
	 
	  @JsonProperty("Attributes")		
	  private List<Attribute> attributes = new ArrayList<Attribute>();

	  @JsonProperty("Price")	
	  private List<Price> price = new ArrayList<Price>();

	  private String buyable = null;

	  private String fullImage = null;

	  private String longDescription = null;

	  private String manufacturer = null;

	  private String name = null;

	  private String parentCategoryID = null;

	  private String partNumber = null;

	  private String productType = null;

	  private String resourceId = null;

	  private String thumbnail = null;

	  private String uniqueID = null;

	  @JsonProperty("xcatentry_CATGROUP_IDENTIFIER")	
	  private String xcatentryCATGROUPIDENTIFIER = null;

	  @JsonProperty("xcatentry_ProductTypeId")
	  private String xcatentryProductTypeId = null;

	  @JsonProperty("xcatentry_STARTDATE")
	  private String xcatentrySTARTDATE = null;

	  @JsonProperty("xcatentry_familyId")
	  private String xcatentryFamilyId = null;
	  
	  @JsonProperty("xcatentry_instore")
	  private String xcatentryInstore = null;

	  @JsonProperty("xcatentry_stockThreshold")
	  private String xcatentryStockThreshold = null;

	  private String inventory = null;

	  @JsonProperty("Mail-in_Rebate")
	  private Integer mailInRebate = null;

	  private String promoDiscountType = null;

	  private String promoDiscountValue = null;

	  private String defaultTab = null;

	  private String display = null;

	  private Integer listPrice = null;

	  private Integer offerPrice = null;

	  private Integer instantDiscount = null;

	  public CatalogEntryView attributes(List<Attribute> attributes) {
	    this.attributes = attributes;
	    return this;
	  }

	  public CatalogEntryView addAttributesItem(Attribute attributesItem) {
	    this.attributes.add(attributesItem);
	    return this;
	  }

	   /**
	   * Get attributes
	   * @return attributes
	  **/
	  @ApiModelProperty(value = "")
	  public List<Attribute> getAttributes() {
	    return attributes;
	  }

	  public void setAttributes(List<Attribute> attributes) {
	    this.attributes = attributes;
	  }

	  public CatalogEntryView price(List<Price> price) {
	    this.price = price;
	    return this;
	  }

	  public CatalogEntryView addPriceItem(Price priceItem) {
	    this.price.add(priceItem);
	    return this;
	  }

	   /**
	   * Get price
	   * @return price
	  **/
	  @ApiModelProperty(value = "")
	  public List<Price> getPrice() {
	    return price;
	  }

	  public void setPrice(List<Price> price) {
	    this.price = price;
	  }

	  public CatalogEntryView buyable(String buyable) {
	    this.buyable = buyable;
	    return this;
	  }

	   /**
	   * Get buyable
	   * @return buyable
	  **/
	  @ApiModelProperty(value = "")
	  public String getBuyable() {
	    return buyable;
	  }

	  public void setBuyable(String buyable) {
	    this.buyable = buyable;
	  }

	  public CatalogEntryView fullImage(String fullImage) {
	    this.fullImage = fullImage;
	    return this;
	  }

	   /**
	   * Get fullImage
	   * @return fullImage
	  **/
	  @ApiModelProperty(value = "")
	  public String getFullImage() {
	    return fullImage;
	  }

	  public void setFullImage(String fullImage) {
	    this.fullImage = fullImage;
	  }

	  public CatalogEntryView longDescription(String longDescription) {
	    this.longDescription = longDescription;
	    return this;
	  }

	   /**
	   * Get longDescription
	   * @return longDescription
	  **/
	  @ApiModelProperty(value = "")
	  public String getLongDescription() {
	    return longDescription;
	  }

	  public void setLongDescription(String longDescription) {
	    this.longDescription = longDescription;
	  }

	  public CatalogEntryView manufacturer(String manufacturer) {
	    this.manufacturer = manufacturer;
	    return this;
	  }

	   /**
	   * Get manufacturer
	   * @return manufacturer
	  **/
	  @ApiModelProperty(value = "")
	  public String getManufacturer() {
	    return manufacturer;
	  }

	  public void setManufacturer(String manufacturer) {
	    this.manufacturer = manufacturer;
	  }

	  public CatalogEntryView name(String name) {
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

	  public CatalogEntryView parentCategoryID(String parentCategoryID) {
	    this.parentCategoryID = parentCategoryID;
	    return this;
	  }

	   /**
	   * Get parentCategoryID
	   * @return parentCategoryID
	  **/
	  @ApiModelProperty(value = "")
	  public String getParentCategoryID() {
	    return parentCategoryID;
	  }

	  public void setParentCategoryID(String parentCategoryID) {
	    this.parentCategoryID = parentCategoryID;
	  }

	  public CatalogEntryView partNumber(String partNumber) {
	    this.partNumber = partNumber;
	    return this;
	  }

	   /**
	   * Get partNumber
	   * @return partNumber
	  **/
	  @ApiModelProperty(value = "")
	  public String getPartNumber() {
	    return partNumber;
	  }

	  public void setPartNumber(String partNumber) {
	    this.partNumber = partNumber;
	  }

	  public CatalogEntryView productType(String productType) {
	    this.productType = productType;
	    return this;
	  }

	   /**
	   * Get productType
	   * @return productType
	  **/
	  @ApiModelProperty(value = "")
	  public String getProductType() {
	    return productType;
	  }

	  public void setProductType(String productType) {
	    this.productType = productType;
	  }

	  public CatalogEntryView resourceId(String resourceId) {
	    this.resourceId = resourceId;
	    return this;
	  }

	   /**
	   * Get resourceId
	   * @return resourceId
	  **/
	  @ApiModelProperty(value = "")
	  public String getResourceId() {
	    return resourceId;
	  }

	  public void setResourceId(String resourceId) {
	    this.resourceId = resourceId;
	  }

	  public CatalogEntryView thumbnail(String thumbnail) {
	    this.thumbnail = thumbnail;
	    return this;
	  }

	   /**
	   * Get thumbnail
	   * @return thumbnail
	  **/
	  @ApiModelProperty(value = "")
	  public String getThumbnail() {
	    return thumbnail;
	  }

	  public void setThumbnail(String thumbnail) {
	    this.thumbnail = thumbnail;
	  }

	  public CatalogEntryView uniqueID(String uniqueID) {
	    this.uniqueID = uniqueID;
	    return this;
	  }

	   /**
	   * Get uniqueID
	   * @return uniqueID
	  **/
	  @ApiModelProperty(value = "")
	  public String getUniqueID() {
	    return uniqueID;
	  }

	  public void setUniqueID(String uniqueID) {
	    this.uniqueID = uniqueID;
	  }

	  public CatalogEntryView xcatentryCATGROUPIDENTIFIER(String xcatentryCATGROUPIDENTIFIER) {
	    this.xcatentryCATGROUPIDENTIFIER = xcatentryCATGROUPIDENTIFIER;
	    return this;
	  }

	   /**
	   * Get xcatentryCATGROUPIDENTIFIER
	   * @return xcatentryCATGROUPIDENTIFIER
	  **/
	  @ApiModelProperty(value = "")
	  public String getXcatentryCATGROUPIDENTIFIER() {
	    return xcatentryCATGROUPIDENTIFIER;
	  }

	  public void setXcatentryCATGROUPIDENTIFIER(String xcatentryCATGROUPIDENTIFIER) {
	    this.xcatentryCATGROUPIDENTIFIER = xcatentryCATGROUPIDENTIFIER;
	  }

	  public CatalogEntryView xcatentryProductTypeId(String xcatentryProductTypeId) {
	    this.xcatentryProductTypeId = xcatentryProductTypeId;
	    return this;
	  }

	   /**
	   * Get xcatentryProductTypeId
	   * @return xcatentryProductTypeId
	  **/
	  @ApiModelProperty(value = "")
	  public String getXcatentryProductTypeId() {
	    return xcatentryProductTypeId;
	  }

	  public void setXcatentryProductTypeId(String xcatentryProductTypeId) {
	    this.xcatentryProductTypeId = xcatentryProductTypeId;
	  }

	  public CatalogEntryView xcatentrySTARTDATE(String xcatentrySTARTDATE) {
	    this.xcatentrySTARTDATE = xcatentrySTARTDATE;
	    return this;
	  }

	   /**
	   * Get xcatentrySTARTDATE
	   * @return xcatentrySTARTDATE
	  **/
	  @ApiModelProperty(value = "")
	  public String getXcatentrySTARTDATE() {
	    return xcatentrySTARTDATE;
	  }

	  public void setXcatentrySTARTDATE(String xcatentrySTARTDATE) {
	    this.xcatentrySTARTDATE = xcatentrySTARTDATE;
	  }

	  /**
	 * @return the xcatentryFamilyId
	 */
	public String getXcatentryFamilyId() {
		return xcatentryFamilyId;
	}

	/**
	 * @param xcatentryFamilyId the xcatentryFamilyId to set
	 */
	public void setXcatentryFamilyId(String xcatentryFamilyId) {
		this.xcatentryFamilyId = xcatentryFamilyId;
	}

	public CatalogEntryView xcatentryInstore(String xcatentryInstore) {
	    this.xcatentryInstore = xcatentryInstore;
	    return this;
	  }

	   /**
	   * Get xcatentryInstore
	   * @return xcatentryInstore
	  **/
	  @ApiModelProperty(value = "")
	  public String getXcatentryInstore() {
	    return xcatentryInstore;
	  }

	  public void setXcatentryInstore(String xcatentryInstore) {
	    this.xcatentryInstore = xcatentryInstore;
	  }

	  public CatalogEntryView xcatentryStockThreshold(String xcatentryStockThreshold) {
	    this.xcatentryStockThreshold = xcatentryStockThreshold;
	    return this;
	  }

	   /**
	   * Get xcatentryStockThreshold
	   * @return xcatentryStockThreshold
	  **/
	  @ApiModelProperty(value = "")
	  public String getXcatentryStockThreshold() {
	    return xcatentryStockThreshold;
	  }

	  public void setXcatentryStockThreshold(String xcatentryStockThreshold) {
	    this.xcatentryStockThreshold = xcatentryStockThreshold;
	  }

	  public CatalogEntryView inventory(String inventory) {
	    this.inventory = inventory;
	    return this;
	  }

	   /**
	   * Get inventory
	   * @return inventory
	  **/
	  @ApiModelProperty(value = "")
	  public String getInventory() {
	    return inventory;
	  }

	  public void setInventory(String inventory) {
	    this.inventory = inventory;
	  }

	  public CatalogEntryView mailInRebate(Integer mailInRebate) {
	    this.mailInRebate = mailInRebate;
	    return this;
	  }

	   /**
	   * Get mailInRebate
	   * @return mailInRebate
	  **/
	  @ApiModelProperty(value = "")
	  public Integer getMailInRebate() {
	    return mailInRebate;
	  }

	  public void setMailInRebate(Integer mailInRebate) {
	    this.mailInRebate = mailInRebate;
	  }

	  public CatalogEntryView promoDiscountType(String promoDiscountType) {
	    this.promoDiscountType = promoDiscountType;
	    return this;
	  }

	   /**
	   * Get promoDiscountType
	   * @return promoDiscountType
	  **/
	  @ApiModelProperty(value = "")
	  public String getPromoDiscountType() {
	    return promoDiscountType;
	  }

	  public void setPromoDiscountType(String promoDiscountType) {
	    this.promoDiscountType = promoDiscountType;
	  }

	  public CatalogEntryView promoDiscountValue(String promoDiscountValue) {
	    this.promoDiscountValue = promoDiscountValue;
	    return this;
	  }

	   /**
	   * Get promoDiscountValue
	   * @return promoDiscountValue
	  **/
	  @ApiModelProperty(value = "")
	  public String getPromoDiscountValue() {
	    return promoDiscountValue;
	  }

	  public void setPromoDiscountValue(String promoDiscountValue) {
	    this.promoDiscountValue = promoDiscountValue;
	  }

	  public CatalogEntryView defaultTab(String defaultTab) {
	    this.defaultTab = defaultTab;
	    return this;
	  }

	   /**
	   * Get defaultTab
	   * @return defaultTab
	  **/
	  @ApiModelProperty(value = "")
	  public String getDefaultTab() {
	    return defaultTab;
	  }

	  public void setDefaultTab(String defaultTab) {
	    this.defaultTab = defaultTab;
	  }

	  public CatalogEntryView display(String display) {
	    this.display = display;
	    return this;
	  }

	   /**
	   * Get display
	   * @return display
	  **/
	  @ApiModelProperty(value = "")
	  public String getDisplay() {
	    return display;
	  }

	  public void setDisplay(String display) {
	    this.display = display;
	  }

	  public CatalogEntryView listPrice(Integer listPrice) {
	    this.listPrice = listPrice;
	    return this;
	  }

	   /**
	   * Get listPrice
	   * @return listPrice
	  **/
	  @ApiModelProperty(value = "")
	  public Integer getListPrice() {
	    return listPrice;
	  }

	  public void setListPrice(Integer listPrice) {
	    this.listPrice = listPrice;
	  }

	  public CatalogEntryView offerPrice(Integer offerPrice) {
	    this.offerPrice = offerPrice;
	    return this;
	  }

	   /**
	   * Get offerPrice
	   * @return offerPrice
	  **/
	  @ApiModelProperty(value = "")
	  public Integer getOfferPrice() {
	    return offerPrice;
	  }

	  public void setOfferPrice(Integer offerPrice) {
	    this.offerPrice = offerPrice;
	  }

	  public CatalogEntryView instantDiscount(Integer instantDiscount) {
	    this.instantDiscount = instantDiscount;
	    return this;
	  }

	   /**
	   * Get instantDiscount
	   * @return instantDiscount
	  **/
	  @ApiModelProperty(value = "")
	  public Integer getInstantDiscount() {
	    return instantDiscount;
	  }

	  public void setInstantDiscount(Integer instantDiscount) {
	    this.instantDiscount = instantDiscount;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    CatalogEntryView catalogEntryView = (CatalogEntryView) o;
	    return Objects.equals(this.attributes, catalogEntryView.attributes) &&
	        Objects.equals(this.price, catalogEntryView.price) &&
	        Objects.equals(this.buyable, catalogEntryView.buyable) &&
	        Objects.equals(this.fullImage, catalogEntryView.fullImage) &&
	        Objects.equals(this.longDescription, catalogEntryView.longDescription) &&
	        Objects.equals(this.manufacturer, catalogEntryView.manufacturer) &&
	        Objects.equals(this.name, catalogEntryView.name) &&
	        Objects.equals(this.parentCategoryID, catalogEntryView.parentCategoryID) &&
	        Objects.equals(this.partNumber, catalogEntryView.partNumber) &&
	        Objects.equals(this.productType, catalogEntryView.productType) &&
	        Objects.equals(this.resourceId, catalogEntryView.resourceId) &&
	        Objects.equals(this.thumbnail, catalogEntryView.thumbnail) &&
	        Objects.equals(this.uniqueID, catalogEntryView.uniqueID) &&
	        Objects.equals(this.xcatentryCATGROUPIDENTIFIER, catalogEntryView.xcatentryCATGROUPIDENTIFIER) &&
	        Objects.equals(this.xcatentryProductTypeId, catalogEntryView.xcatentryProductTypeId) &&
	        Objects.equals(this.xcatentrySTARTDATE, catalogEntryView.xcatentrySTARTDATE) &&
	        Objects.equals(this.xcatentryInstore, catalogEntryView.xcatentryInstore) &&
	        Objects.equals(this.xcatentryStockThreshold, catalogEntryView.xcatentryStockThreshold) &&
	        Objects.equals(this.inventory, catalogEntryView.inventory) &&
	        Objects.equals(this.mailInRebate, catalogEntryView.mailInRebate) &&
	        Objects.equals(this.promoDiscountType, catalogEntryView.promoDiscountType) &&
	        Objects.equals(this.promoDiscountValue, catalogEntryView.promoDiscountValue) &&
	        Objects.equals(this.defaultTab, catalogEntryView.defaultTab) &&
	        Objects.equals(this.display, catalogEntryView.display) &&
	        Objects.equals(this.listPrice, catalogEntryView.listPrice) &&
	        Objects.equals(this.offerPrice, catalogEntryView.offerPrice) &&
	        Objects.equals(this.instantDiscount, catalogEntryView.instantDiscount);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(attributes, price, buyable, fullImage, longDescription, manufacturer, name, parentCategoryID, partNumber, productType, resourceId, thumbnail, uniqueID, xcatentryCATGROUPIDENTIFIER, xcatentryProductTypeId, xcatentrySTARTDATE, xcatentryInstore, xcatentryStockThreshold, inventory, mailInRebate, promoDiscountType, promoDiscountValue, defaultTab, display, listPrice, offerPrice, instantDiscount);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class CatalogEntryView {\n");
	    
	    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
	    sb.append("    price: ").append(toIndentedString(price)).append("\n");
	    sb.append("    buyable: ").append(toIndentedString(buyable)).append("\n");
	    sb.append("    fullImage: ").append(toIndentedString(fullImage)).append("\n");
	    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
	    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
	    sb.append("    name: ").append(toIndentedString(name)).append("\n");
	    sb.append("    parentCategoryID: ").append(toIndentedString(parentCategoryID)).append("\n");
	    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
	    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
	    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
	    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
	    sb.append("    uniqueID: ").append(toIndentedString(uniqueID)).append("\n");
	    sb.append("    xcatentryCATGROUPIDENTIFIER: ").append(toIndentedString(xcatentryCATGROUPIDENTIFIER)).append("\n");
	    sb.append("    xcatentryProductTypeId: ").append(toIndentedString(xcatentryProductTypeId)).append("\n");
	    sb.append("    xcatentrySTARTDATE: ").append(toIndentedString(xcatentrySTARTDATE)).append("\n");
	    sb.append("    xcatentryInstore: ").append(toIndentedString(xcatentryInstore)).append("\n");
	    sb.append("    xcatentryStockThreshold: ").append(toIndentedString(xcatentryStockThreshold)).append("\n");
	    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
	    sb.append("    mailInRebate: ").append(toIndentedString(mailInRebate)).append("\n");
	    sb.append("    promoDiscountType: ").append(toIndentedString(promoDiscountType)).append("\n");
	    sb.append("    promoDiscountValue: ").append(toIndentedString(promoDiscountValue)).append("\n");
	    sb.append("    defaultTab: ").append(toIndentedString(defaultTab)).append("\n");
	    sb.append("    display: ").append(toIndentedString(display)).append("\n");
	    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
	    sb.append("    offerPrice: ").append(toIndentedString(offerPrice)).append("\n");
	    sb.append("    instantDiscount: ").append(toIndentedString(instantDiscount)).append("\n");
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

