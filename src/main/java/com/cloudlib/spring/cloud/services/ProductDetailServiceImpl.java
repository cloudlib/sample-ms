package com.cloudlib.spring.cloud.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cloudlib.spring.cloud.configuration.ApplicationConstants;
import com.cloudlib.spring.cloud.exception.ApiException;
import com.cloudlib.spring.cloud.model.CatalogEntryView;
import com.cloudlib.spring.cloud.model.ProductDetail;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ProductDetailServiceImpl extends BaseLoggingService  implements ProductDetailService {
	
	public ProductDetailServiceImpl(Tracer tracer) {
		super(tracer);
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductDetailServiceImpl.class);
	
	@Autowired
	ApplicationConstants applicationConstants;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	@HystrixCommand(groupKey ="ProductDetailService", commandKey = "productDetailByPartnumber", 
		fallbackMethod = "getDefaultProductDetailByPartnumber"
	)
	@Cacheable(cacheNames="productdetails", key="#partnumber")
	public ProductDetail getProductDetailByPartnumber(String partnumber, String storeid) throws ApiException {
		final String methodName = this.getClass().getSimpleName() + ".getProductDetailByPartnumber";
		final String[] methodArgs = new String[] {partnumber, storeid};
		
		LOGGER.info("Fetching product detail for input params: [partnumber: {}, storeid: {}]", partnumber, storeid);
		
//		StringBuffer wcaURL = new StringBuffer(this.wcaEndPoint).append("/wcs/resources/store/").append(storeid).append("/tmobile/product/byPartNumber/").append(partnumber);
		String wcaURL = applicationConstants.getWcaEndPoint() +"/wcs/resources/store/" + storeid + "/tmobile/product/byPartNumber/" + partnumber ;
		LOGGER.info("Invoking Commerce Service: {}", wcaURL);
		ProductDetail details = restTemplate.getForObject(wcaURL, ProductDetail.class);
		if(details == null){
			throw new ApiException(HttpStatus.NOT_FOUND, "Product Detail not found  for the requested phone.",
					methodName, methodArgs);
		}
		
		//Remove the attributes from the product detail and also remove the extra product object if more than one is retrieved
		if(details.getCatalogEntryView() != null && !details.getCatalogEntryView().isEmpty()){
			CatalogEntryView defaultProduct = details.getCatalogEntryView().get(0);
			defaultProduct.setAttributes(null);
			defaultProduct.setThumbnail(formatImagePaths(defaultProduct.getThumbnail()));
			defaultProduct.setFullImage(formatImagePaths(defaultProduct.getFullImage()));
			
			if(details.getCatalogEntryView().size() > 1){
				List<CatalogEntryView> list = new ArrayList<CatalogEntryView>();
				list.add(defaultProduct);
				details.setCatalogEntryView(list);
			}
		}
		
		// emit get event
		logEvent(tags().resource("Product").operation("GET").tag("partnumber", partnumber).build());
//				log.info("ProductCTADetailsServiceImpl:getProductCtaDetailsListByPartnumber::result for partnumber:"+partnumber +"is = "+result);
		return details;
	
	}
	
	public ProductDetail getDefaultProductDetailByPartnumber(String partnumber, String storeid, Throwable cause) throws Throwable {
		LOGGER.error("ProductDetailServiceImpl:getDefaultProductDetailByPartnumber:: request handled by fallback method for partnumber="+partnumber);
		LOGGER.error("Exception occured is : "+cause.toString());
//		return null;
		throw cause;
	}
	
	public ProductDetail getDefaultProductDetailBySearchTerm(String searchterm, String storeid, Throwable cause) throws Throwable {
		LOGGER.error("getDefaultProductDetailBySearchTerm::request handled by fallback method. returning emtpy for searchterm="+searchterm);
		LOGGER.error("Exception occured is : "+cause.toString());
		throw cause;
	}

	@Override
	@HystrixCommand(groupKey ="ProductDetailService", commandKey = "productDetailBySearchTerm", 
	fallbackMethod = "getDefaultProductDetailBySearchTerm"
     )
//	@Cacheable(cacheNames="productdetails", key="#searchterm")
	public ProductDetail getProductDetailBySearchTerm(String searchterm, String storeid) throws ApiException {
		final String methodName = this.getClass().getSimpleName() + ".getProductDetailByPartnumber";
		final String[] methodArgs = new String[] {searchterm, storeid};
		
		LOGGER.info("Fetching product detail for input params: [searchterm: {}, storeid: {}]", searchterm, storeid);

//			StringBuffer wcaURL = new StringBuffer(this.wcaEndPoint).append("/wcs/resources/store/").append(storeid).append("/tmobile/product/byPartNumber/").append(partnumber);
		String wcaURL = applicationConstants.getWcaEndPoint() +"/wcs/resources/store/" + storeid + "/tmobile/product/bySearchTerm/" + searchterm + "?searchType=any";
		LOGGER.info("Invoking Commerce Service: "+wcaURL);
		ProductDetail details = restTemplate.getForObject(wcaURL, ProductDetail.class);
		if(details == null){
			throw new ApiException(HttpStatus.NOT_FOUND, "Product Detail not found  for the requested search term.",
					methodName, methodArgs);
		}
		
		// emit get event
		logEvent(tags().resource("Product").operation("GET").tag("Product", searchterm).build());
//				log.info("ProductCTADetailsServiceImpl:getProductCtaDetailsListByPartnumber::result for partnumber:"+partnumber +"is = "+result);
		return details;
	
	}

	private String formatImagePaths(String path) {
		int storeStringIndex = path.indexOf("ExtendedSitesCatalogAssetStore")+31;
		path = path.substring(storeStringIndex,path.length());
		return path;
	}
	
}
