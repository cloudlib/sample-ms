package com.cloudlib.spring.cloud.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cloudlib.spring.cloud.exception.ApiException;
import com.cloudlib.spring.cloud.metrics.CollectMetrics;
import com.cloudlib.spring.cloud.services.ProductDetailService;

import io.swagger.annotations.ApiParam;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-07T13:57:55.449-08:00")

@RestController
public class ProductDetailApiController implements ProductDetailApi {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductDetailApiController.class);
	
	@Autowired
	ProductDetailService service;

	@CollectMetrics(true)
    public ResponseEntity<?> getProductDetailByPartNumber(
@ApiParam(value = "part number",required=true ) @PathVariable("partnumber") String partnumber
,
@ApiParam(value = "store id",required=true ) @PathVariable("storeid") String storeid


) throws ApiException {
		LOGGER.info("ProductDetailApiController : getProductDetailByPartNumber :: partnumber = {}", partnumber);
		return ResponseEntity.ok(service.getProductDetailByPartnumber(partnumber, storeid));
        
    }

	@Override
	@CollectMetrics(true)
	public ResponseEntity<?> getProductDetailBySearchTerm(
			@ApiParam(value = "search term",required=true ) @PathVariable("searchterm") String searchterm, 
			@ApiParam(value = "store id",required=true ) @PathVariable("storeid") String storeid) throws ApiException {
		
		LOGGER.info("ProductDetailApiController : getProductDetailBySearchTerm :: searchterm = {}", searchterm);
		return ResponseEntity.ok(service.getProductDetailBySearchTerm(searchterm, storeid));
		
	}

}
