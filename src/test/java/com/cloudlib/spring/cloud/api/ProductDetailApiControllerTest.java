package com.cloudlib.spring.cloud.api;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.cloudlib.spring.cloud.exception.ApiException;
import com.cloudlib.spring.cloud.exception.Error;
import com.cloudlib.spring.cloud.model.ProductDetail;
import com.cloudlib.spring.cloud.services.ProductDetailService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@ContextConfiguration(classes = TestApplicationContext.class)
@ActiveProfiles("test")
public class ProductDetailApiControllerTest{

	private MockMvc mockMvc;
	
    @Autowired
    private WebApplicationContext webApplicationContext;
	 
	@MockBean
	ProductDetailService productDetailService;
	
	@Autowired
	ObjectMapper mapper;
	
	@Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }
	
	@Test
	public void productDetails200Response() throws Exception {
		
		Resource resource = new ClassPathResource("productdetail_by_partnumber_full.json");
		ProductDetail product = mapper.readValue(resource.getFile(), ProductDetail.class);
		
		given(this.productDetailService.getProductDetailByPartnumber("610214633569", "10154")).willReturn(product);
		this.mockMvc.perform(
				get("/store/10154/product/byPartNumber/610214633569").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string(mapper.writeValueAsString(product)));
	}
	
	@Test
	public void productDetails404ResponseInvalidMaping() throws Exception {
		this.mockMvc.perform(get("/store/10154/product/byPartNumber/610214633569/InvalidMapping")
//				.header("HttpSig", "123").header("Authorization", "123")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().is(404));
	}
	
	@Test
	public void productDetails5xxResponse() throws Exception {
		ApiException ex = new ApiException(HttpStatus.NOT_FOUND, "Product Detail not found  for the requested phone.");
		Error error = new Error().code(HttpStatus.NOT_FOUND.value())
				.message("Product Detail not found  for the requested phone.");
		given(this.productDetailService.getProductDetailByPartnumber("610214", "10154")).willThrow(ex);
		try{
			this.mockMvc.perform(get("/store/10154/product/byPartNumber/610214").contentType(MediaType.APPLICATION_JSON)
//					.header("HttpSig", "123").header("Authorization", "123")
					.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().is5xxServerError()).andExpect(content().string(mapper.writeValueAsString(error)));
		} catch(Exception e){
			System.out.println("Exception: "+ e);
			if(e instanceof ApiException){
				System.out.println("API Exception: "+ e);
			}
		}
	}
	
	@Test
	public void productDetailBySearchTerm200Response() throws Exception {
		
		Resource resource = new ClassPathResource("productdetail_by_searchterm_full.json");
		ProductDetail product = mapper.readValue(resource.getFile(), ProductDetail.class);
		
		given(this.productDetailService.getProductDetailBySearchTerm("Apple-6s", "10154")).willReturn(product);
		
		this.mockMvc.perform(
				get("/store/10154/product/bySearchTerm/Apple-6s").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string(mapper.writeValueAsString(product)));
	}
	
	@Test
	public void productDetailBySearchTerm5xxResponse() throws Exception {
		
		ApiException ex = new ApiException(HttpStatus.NOT_FOUND, "Product Detail not found  for the requested search term.");
		Error error = new Error().code(HttpStatus.NOT_FOUND.value())
				.message("Product Detail not found  for the requested search term.");
		given(this.productDetailService.getProductDetailBySearchTerm("Apple-6s", "10154")).willThrow(ex);
		
		this.mockMvc.perform(get("/store/10154/product/bySearchTerm/Apple-6s").contentType(MediaType.APPLICATION_JSON)
//				.header("HttpSig", "123").header("Authorization", "123")
				.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().is5xxServerError()).andExpect(content().string(mapper.writeValueAsString(error)));
	}
}
