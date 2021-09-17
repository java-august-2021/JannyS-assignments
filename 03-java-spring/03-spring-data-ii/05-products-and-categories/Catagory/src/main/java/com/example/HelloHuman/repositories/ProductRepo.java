package com.example.HelloHuman.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.HelloHuman.models.Catagory;
import com.example.HelloHuman.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
	List<Product> findAll();
	
    List<Product> findAllByCatagories(Catagory catagory);
    
    List<Product> findByCatagoriesNotContains(Catagory catagory);
}
