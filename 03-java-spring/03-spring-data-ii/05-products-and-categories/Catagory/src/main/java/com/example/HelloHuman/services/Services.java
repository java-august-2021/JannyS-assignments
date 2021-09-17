package com.example.HelloHuman.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HelloHuman.models.Catagory;
import com.example.HelloHuman.models.Product;
import com.example.HelloHuman.repositories.CatagoryRepo;
import com.example.HelloHuman.repositories.ProductRepo;

@Service
public class Services {
	@Autowired
	private ProductRepo pRepo;
	@Autowired
	private CatagoryRepo cRepo;

	public Services(ProductRepo pRepo, CatagoryRepo cRepo) {
		this.pRepo = pRepo;
		this.cRepo = cRepo;
	}
	
	public List<Product> allProducts() {
		return this.pRepo.findAll();
	}
	
	public void createRelationship(Long productId, Long catagoryId) {

	    Catagory thisCatagory = findCatagory(catagoryId);

	    Product thisProduct = findProduct(productId);

	    thisCatagory.getProducts().add(thisProduct);

	    cRepo.save(thisCatagory);
	}
	
	public void createRelate(Long catagoryId, Long productId) {
	    Catagory thisCatagory = findCatagory(catagoryId);

	    Product thisProduct = findProduct(productId);

	    thisProduct.getCatagories().add(thisCatagory);
	    
	    pRepo.save(thisProduct);
	}
	
	public Product createProduct(Product product) {
		return pRepo.save(product);
	}
	public Product findProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public List<Catagory> findCatsNotIncludedByProduct(Product product){
		return this.cRepo.findByProductsNotContains(product);
	}
	public List<Catagory> findCatsByProduct(Product product){
		return this.cRepo.findAllByProducts(product);
	}
	public List<Product> findProdsByCats(Catagory catagory){
		return this.pRepo.findAllByCatagories(catagory);
	}
	public List<Product> findProdsNotIncludedByCats(Catagory catagory){
		return this.pRepo.findByCatagoriesNotContains(catagory);
	}
	public List<Catagory> allCatagories() {
		return this.cRepo.findAll();
	}
	public Catagory createCatagory(Catagory catagory) {
		return cRepo.save(catagory);
	}
	public Catagory findCatagory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
}
