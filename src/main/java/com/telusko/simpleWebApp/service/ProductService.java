package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",20000),
            new Product(102,"samsung",10000)
    ));

    public List<Product> getProducts(){
        return products;
    }


    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(new Product(prodId,"not found",0));
    }


    public String addProduct(Product product) {
        products.add(product);
        return "added product successfully";

    }

    public String deleteProduct(int prodId) {
        products
                .removeIf(p -> (p.getProdId() == prodId));
        return "deleted product successfully";
    }

    public String updateProduct(Product product) {
        products
                .removeIf(p -> (p.getProdId() == product.getProdId()));
        products.add(product);
        return "product updated successfully";
    }
}
