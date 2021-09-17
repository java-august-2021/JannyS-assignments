package com.example.HelloHuman.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.HelloHuman.models.Catagory;
import com.example.HelloHuman.models.Product;
import com.example.HelloHuman.services.Services;

@Controller
public class HomeController {
	@Autowired
	private final Services pSer;
	
	public HomeController(Services pSer) {
		this.pSer = pSer;
	}
	
	@GetMapping("/product")
	public String displayProduct(@ModelAttribute("product") Product product) {
		return "product.jsp";
	}
	@GetMapping("/showproduct")
	public String showProduct() {
		return "showproduct.jsp";
	}
	
	@PostMapping("/product")
	public String sendToDatabase(@ModelAttribute("product") Product product) {
		Product newProduct = this.pSer.createProduct(product);
		Long prodId = newProduct.getId();
		return "redirect:/products/" + prodId ;
	}
	
	@GetMapping("/product/{id}")
	public String oneProd(@PathVariable("id") Long id, Model model) {
		Product oneProduct = this.pSer.findProduct(id);
		model.addAttribute("product", oneProduct);
		model.addAttribute("allCats", this.pSer.findCatsByProduct(oneProduct));
		model.addAttribute("allNotCats", this.pSer.findCatsNotIncludedByProduct(oneProduct));
		return "showproduct.jsp";
	}
	
	@PostMapping("/product/{id}")
	public String addProd(@RequestParam("catagories") Long catagoryId, @PathVariable("id") Long id, Model model) {
		Catagory catId = pSer.findCatagory(catagoryId);
		pSer.createRelationship(id, catagoryId);
		return "redirect:/product/{id}";
	}
	
	@GetMapping("/catagory")
	public String displayCatagory(@ModelAttribute("category") Catagory catagory) {
		return "catagory.jsp";
	}
	
	@PostMapping("/catagory")
	public String whatCatagory(@ModelAttribute("catagory") Catagory catagory, Model model) {
		Catagory newCat = this.pSer.createCatagory(catagory);
		Long catId = newCat.getId();
		return "redirect:/category/" + catId;//should redirect to the next page
	}
	
	@GetMapping("/catagory/{id}")
	public String oneCat(@PathVariable("id") Long id, Model model) {
		Catagory oneCatagory = this.pSer.findCatagory(id);
		model.addAttribute("category", oneCatagory);
		model.addAttribute("allNotProds", this.pSer.findProdsNotIncludedByCats(oneCatagory));
		return "showcatagory.jsp";
	}
	
	@PostMapping("/catagory/{id}")
	public String addCat(@RequestParam("product") Long productId, @PathVariable("id") Long id, Model model) {
		pSer.createRelate(id, productId);
		return "redirect:/catagory/{id}";
	}
	
}
