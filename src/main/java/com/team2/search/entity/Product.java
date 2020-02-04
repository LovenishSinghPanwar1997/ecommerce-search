package com.team2.search.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Getter
@Setter
@SolrDocument(collection = "ecommsearch")
public class Product {


    @Id
    @Indexed(name = "productId",type = "string")
    private String productId;

    @Indexed(name = "productName",type = "string")
    private String productName;

    @Indexed(name="productPrice",type = "double")
    private Double productPrice;

    @Indexed(name = "productDescription",type = "string")
    private String productDescription;

    @Indexed(name = "usp",type = "string")
    private String usp;

    @Indexed(name = "attributes",type = "string")
    private String attributes;

    @Indexed(name ="productImage",type = "string")
    private String productImage;

    @Indexed(name = "categories",type = "string[]")
    private String categories;

    @Indexed(name = "quantity",type = "integer")
    private Integer quantity;

    @Indexed(name = "merchantId",type = "string")
    private String merchantId;

}
