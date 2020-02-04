package com.team2.search.repository;

import com.team2.search.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface ProductRepository extends SolrCrudRepository<Product,String> {

    Product findByProductId(String productId);

    Page<Product> findByProductDescription(String searchTerm, Pageable pageable);

    Page<Product> findByProductName(String searchTerm,Pageable pageable);

    Page<Product> findByProductPrice(Double searchTerm,Pageable pageable);

    Page<Product> findByUsp(String searchTerm,Pageable pageable);

    Page<Product> findByAttributes(String searchTerm,Pageable pageable);

    @Query("productId:*?0* OR productName:*?0* OR productDescription:*?0* OR usp:*?0* OR attributes:*?0* OR categories:*?0*")
    List<Product> findByCustomQuery(String searchTerm);


}


