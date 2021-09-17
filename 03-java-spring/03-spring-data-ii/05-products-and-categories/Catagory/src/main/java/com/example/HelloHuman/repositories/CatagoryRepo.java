package com.example.HelloHuman.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.HelloHuman.models.Catagory;
import com.example.HelloHuman.models.Product;
@Repository
public interface CatagoryRepo extends CrudRepository<Catagory, Long> {
	List<Catagory> findAll();
	
    List<Catagory> findAllByProducts(Product product);
    
    List<Catagory> findByProductsNotContains(Product product);

}
