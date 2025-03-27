package com.bridgelabz.marketplace;
import java.util.*;

public class ProductStore {
    private List<Product<? extends ProductCategory>> products = new ArrayList<>();

    public void addProduct(Product<? extends ProductCategory> product){
        products.add(product);
    }

    public void displayDetails(){
        System.out.println("Product Details:");
        for(Product<? extends ProductCategory> product : products){
            product.displayProduct();
        }
    }



}
