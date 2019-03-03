package com.sample.SpringBootSample.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.SpringBootSample.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long >{

}
