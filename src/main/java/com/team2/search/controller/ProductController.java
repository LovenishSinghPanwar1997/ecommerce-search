package com.team2.search.controller;

import com.team2.search.entity.Product;
import com.team2.search.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("search-ms")
@CrossOrigin(origins = {"*"})
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/product")
    public String addProductInSearchDb(@RequestBody Product product) {
        String description = "Product Added";
        productRepository.save(product);
        return description;
    }

    @GetMapping("/product/{productId}")
    public Product readOrder(@PathVariable("orderid") String productId) {
        return productRepository.findByProductId(productId);
    }

    @GetMapping("product/search/{searchTerm}")
    public List<Product> findByCustomQuery(@PathVariable("searchTerm") String searchTerm)
    {
        return productRepository.findByCustomQuery(searchTerm);
    }

}
