package com.cloudlib.spring.cloud.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ApplicationConstants {

	@Value("${commerce.catalog.host}")
	String wcaEndPoint;
	
	@Value("${commerce.catalog.store.cart}")
	String cartStoreId;

	public String getWcaEndPoint() {
		return wcaEndPoint;
	}

	public void setWcaEndPoint(String wcaEndPoint) {
		this.wcaEndPoint = wcaEndPoint;
	}

	public String getCartStoreId() {
		return cartStoreId;
	}

	public void setCartStoreId(String cartStoreId) {
		this.cartStoreId = cartStoreId;
	}
	
	

}
