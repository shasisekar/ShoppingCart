package com.sample.SpringBootSample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import com.sample.SpringBootSample.entity.Product;
import com.sample.SpringBootSample.repository.ProductRepository;

@Component
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	public List<Product> getAllProducts(){
		List<Product> productList = new ArrayList();
		/*productRepository.findAll().forEach(prodcutList::add);
		System.out.println("prodcutList.size() \t \t"+prodcutList.size());
		*/
		
		productList = (List<Product>) productRepository.findAll();
	
		Product p = productList.get(0);
		
		return productList;
		
	}
}
