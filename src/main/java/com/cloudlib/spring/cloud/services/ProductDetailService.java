package com.cloudlib.spring.cloud.services;

import org.springframework.stereotype.Service;

import com.cloudlib.spring.cloud.exception.ApiException;
import com.cloudlib.spring.cloud.model.ProductDetail;

@Service
public interface ProductDetailService {
	public ProductDetail getProductDetailByPartnumber(String partnumber, String storeid) throws ApiException;
	public ProductDetail getProductDetailBySearchTerm(String searchTerm, String storeid) throws ApiException;

}
