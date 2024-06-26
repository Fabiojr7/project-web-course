package com.study.course.services;

import com.study.course.entities.Product;
import com.study.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public Product findProductById(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }
}
