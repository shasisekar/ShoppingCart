package com.sample.SpringBootSample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@lombok.Data
@Component
@Entity
@Table(name="PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "productId")
	int productId;
	
	@Column(name = "productName")
	String productName;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "shortDescription")
	String shortDescription;
	
	@Column(name = "price")
	int price;
	
	@Column(name = "imageName")
	String imageName;
	
}
