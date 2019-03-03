package com.sample.SpringBootSample.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.SpringBootSample.entity.IndexEntity;
import com.sample.SpringBootSample.entity.Product;
import com.sample.SpringBootSample.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET, value="/products" )
	public List<Product> getAllProducts() throws UnknownHostException {
		List<Product> productList =new ArrayList<Product>();
		productList= productService.getAllProducts(); 
	
		Product p = productList.get(0);
		System.out.println("Host Name..." + InetAddress.getLocalHost().getHostName());
		return productList;
		
//		return new ResponseEntity<List>(productList, HttpStatus.OK);
	}
}
