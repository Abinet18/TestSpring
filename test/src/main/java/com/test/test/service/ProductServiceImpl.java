package com.test.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.model.Product;
import com.test.test.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Optional<Product> getProduct(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public Product createProduct(Product p) {		
		productRepository.save(p);
		return p;
	}

	@Override
	public Product updateProduct(Product p) {		
		productRepository.save(p);
		return p;
	}

	@Override
	public Long deleteProduct(Long id) {
		productRepository.deleteById(id);
		return id;
	}

}
