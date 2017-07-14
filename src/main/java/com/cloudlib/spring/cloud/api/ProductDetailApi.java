package com.cloudlib.spring.cloud.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloudlib.spring.cloud.exception.ApiException;
import com.cloudlib.spring.cloud.model.ProductDetail;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-07T13:57:55.449-08:00")

@Api(value = "store", description = "the store API")
public interface ProductDetailApi {

    @ApiOperation(value = "product details", notes = "Returns product details from the commerce catalog", response = ProductDetail.class, tags={ "product details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "product details object", response = ProductDetail.class),
        @ApiResponse(code = 400, message = "Invalid or missing parameters", response = ProductDetail.class),
        @ApiResponse(code = 503, message = "Unexpected error", response = ProductDetail.class) })
    @RequestMapping(value = "/store/{storeid}/product/byPartNumber/{partnumber}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> getProductDetailByPartNumber(
@ApiParam(value = "part number",required=true ) @PathVariable("partnumber") String partnumber
,
@ApiParam(value = "store id",required=true ) @PathVariable("storeid") String storeid

) throws ApiException;
    
    @ApiOperation(value = "product details by search term", notes = "Returns product details from the commerce catalog", response = ProductDetail.class, tags={ "product details", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "product details object", response = ProductDetail.class),
        @ApiResponse(code = 400, message = "Invalid or missing parameters", response = ProductDetail.class),
        @ApiResponse(code = 503, message = "Unexpected error", response = ProductDetail.class) })
    @RequestMapping(value = "/store/{storeid}/product/bySearchTerm/{searchterm}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<?> getProductDetailBySearchTerm(
@ApiParam(value = "search term",required=true ) @PathVariable("searchterm") String searchterm
,
@ApiParam(value = "store id",required=true ) @PathVariable("storeid") String storeid

) throws ApiException;

}
