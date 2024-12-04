package com.telusko.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int prodId;
    private String prodName;
    private int price;
    
    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }

    // Use this method if json is not getting converted to object type. It may occur if any issues at jackson annotation. will get 500 error code
    //@JsonCreator
    //public User(@JsonProperty("prodId") int prodId,@Jsonproperty("prodName") String prodName, @Jsonproperty("price") int price){
    //    this.prodId=prodId;
    //    this.prodName=prodName;
    //    this.price=price;
    //}
        

    
}
