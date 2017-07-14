package com.cloudlib.spring.cloud.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.BDDMockito.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.cloudlib.spring.cloud.configuration.ApplicationConstants;
import com.cloudlib.spring.cloud.exception.ApiException;
import com.cloudlib.spring.cloud.model.ProductDetail;
import com.cloudlib.spring.cloud.services.ProductDetailService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ProductDetailServiceTest {
	
	@Autowired
	ProductDetailService productDetailService;
	@MockBean
	RestTemplate restTemplate;
	@MockBean
	Tracer tracer;
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	ApplicationConstants constants;

	
	@Test
	public void productDetailByPartNumber200Response() throws Exception {
		
		given(constants.getCartStoreId()).willReturn("10154");
		given(constants.getWcaEndPoint()).willReturn("http://testcommerce.cloudlib.com");
		
		Resource resource = new ClassPathResource("productdetail_by_partnumber_full.json");
		ProductDetail product = mapper.readValue(resource.getFile(), ProductDetail.class);
		String wcaURL = constants.getWcaEndPoint() +"/wcs/resources/store/" + 10154 + "/cloudlib/product/byPartNumber/" + "610214633569" ;
		
		given(restTemplate.getForObject(
				wcaURL, 
				ProductDetail.class))
		.willReturn(product);
		
//		Optional<ProductDetail> result = this.productDetailService.getProductDetailByPartnumber("610214633569", "10154");
		ProductDetail productDetail = this.productDetailService.getProductDetailByPartnumber("610214633569", "10154");
		
		assertNotNull("product detail object can't be null in optional", productDetail);
		assertNotNull("catalog entry view list can't be null", productDetail.getCatalogEntryView());
		assertNotEquals("catalog entry view list can't be empty", productDetail.getCatalogEntryView().size(), 0);
		assertEquals("catalog entry view list was expected of size 1", productDetail.getCatalogEntryView().size(), 1);
		
		assertNotNull("Price can't be null", productDetail.getCatalogEntryView().get(0).getPrice());
		assertNotEquals("attributes list can't be empty", productDetail.getCatalogEntryView().get(0).getPrice().size(), 0);
		
	}
	
	@Test
	public void productDetailByPartNumberApiException() throws Exception {
		
		given(constants.getCartStoreId()).willReturn("10154");
		given(constants.getWcaEndPoint()).willReturn("http://testcommerce.cloudlib.com");
		
		String wcaURL = constants.getWcaEndPoint() +"/wcs/resources/store/" + 10154 + "/cloudlib/product/byPartNumber/" + "610214633569" ;
		
		given(restTemplate.getForObject(
				wcaURL, 
				ProductDetail.class))
		.willReturn(null);
		
		try{
			this.productDetailService.getProductDetailByPartnumber("610214633569", "10154");
			fail("Expected an Exception to be thrown");
		} catch (Exception ex){
			assertTrue("APIException was expected", (ex instanceof ApiException || ex.getCause() instanceof ApiException));
		}
	}
	
	@Test
	public void productDetailBySearchTerm200Response() throws Exception {
		
		given(constants.getCartStoreId()).willReturn("10154");
		given(constants.getWcaEndPoint()).willReturn("http://testcommerce.cloudlib.com");
		
		Resource resource = new ClassPathResource("productdetail_by_searchterm_full.json");
		ProductDetail product = mapper.readValue(resource.getFile(), ProductDetail.class);
		String wcaURL = constants.getWcaEndPoint() +"/wcs/resources/store/" + 10154 + "/cloudlib/product/bySearchTerm/" + "Apple-6s?searchType=any" ;
		
		given(restTemplate.getForObject(
				wcaURL, 
				ProductDetail.class))
		.willReturn(product);
		
//		Optional<ProductDetail> result = this.productDetailService.getProductDetailByPartnumber("610214633569", "10154");
		ProductDetail productDetail = this.productDetailService.getProductDetailBySearchTerm("Apple-6s", "10154");
		
		assertNotNull("product detail object can't be null in optional", productDetail);
		assertNotNull("catalog entry view list can't be null", productDetail.getCatalogEntryView());
		assertNotEquals("catalog entry view list can't be empty", productDetail.getCatalogEntryView().size(), 0);
		assertEquals("catalog entry view list was expected of size 4", productDetail.getCatalogEntryView().size(), 4);
		
		assertNotNull("Price can't be null", productDetail.getCatalogEntryView().get(0).getPrice());
		assertNotEquals("attributes list can't be empty", productDetail.getCatalogEntryView().get(0).getPrice().size(), 0);
		
	}
	
	@Test
	public void productDetailBySearchTermApiException() throws Exception {
		
		given(constants.getCartStoreId()).willReturn("10154");
		given(constants.getWcaEndPoint()).willReturn("http://testcommerce.cloudlib.com");
		
		//http://testcommerce.cloudlib.com/wcs/resources/store/10154/cloudlib/product/byPartNumber/610214633569
		String wcaURL = constants.getWcaEndPoint() +"/wcs/resources/store/" + 10154 + "/cloudlib/product/bySearchTerm/" + "Apple-6s?searchType=any" ;
		
		given(restTemplate.getForObject(
				wcaURL, 
				ProductDetail.class))
		.willReturn(null);
		
		try{
			this.productDetailService.getProductDetailBySearchTerm("Apple-6s", "10154");
			fail("Expected an Exception to be thrown");
		} catch (Exception ex){
			assertTrue("APIException was expected", (ex instanceof ApiException || ex.getCause() instanceof ApiException));
		}
	}

	@Test
	public void productDetailByPartNumberFallbackResponse() throws Exception {
		
		given(constants.getCartStoreId()).willReturn("10154");
		given(constants.getWcaEndPoint()).willReturn("http://testcommerce.cloudlib.com");
		
		String wcaURL = constants.getWcaEndPoint() +"/wcs/resources/store/" + 10154 + "/cloudlib/product/byPartNumber/" + "610214633569" ;
		
		given(restTemplate.getForObject(
				wcaURL, 
				ProductDetail.class))
		.willThrow(new RestClientException(wcaURL));
		
		try{
			ProductDetail result = this.productDetailService.getProductDetailByPartnumber("610214633569", "10154");
			fail("Expected an Exception from fallback method to be thrown");
		}  catch (Exception ex){
//			assertTrue("A Hystrix Exception was expected", ex.getClass().getName().contains("Hystrix"));
		}
		
	}
	
}
